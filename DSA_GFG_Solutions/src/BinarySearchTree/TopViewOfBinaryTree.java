package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopViewOfBinaryTree {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	
	static class Pair {
        Node node;
        int distance;
        
        Pair(Node node,int distance) {
            this.node = node;
            this.distance = distance;
        }
        
    }
    
    static ArrayList<Integer> topView(Node root) {
        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int minDist = 0;
        int maxDist = 0;
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            if(temp.node.left != null)   queue.add(new Pair(temp.node.left,temp.distance-1));
            if(temp.node.right != null)   queue.add(new Pair(temp.node.right,temp.distance+1));
            if(temp.distance < 0)
                minDist = Math.min(minDist,temp.distance);
            else
                maxDist = Math.max(maxDist,temp.distance);
            if(!map.containsKey(temp.distance))
                map.put(temp.distance,temp.node.data);
        }
        for(int i=minDist;i<=maxDist;i++)
            result.add(map.get(i));
        return result;    
    }
    
	public static void main(String[] args) {
		System.out.println("Top view of Binary Tree");
	}

}
