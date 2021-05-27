package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VerticalTraversalOfBinaryTree {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=null;
	        right=null;
	    }
	}
	
	static Map<Integer,ArrayList<Integer>> levelMap; //Or you may use treemap because it maintains sorted order of key. No need of minDist and maxDist
    static int minDist;
    static int maxDist;
    
    static class Pair {
        Node node;
        int distance;
        
        Pair(Node node,int distance) {
            this.node = node;
            this.distance = distance;
        }
        
    }
    
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root) {
        levelMap = new HashMap<Integer,ArrayList<Integer>>();
        minDist = 0;
        maxDist = 0;
        traverse(root);
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        for(int i=minDist;i<=maxDist;i++)
            result.addAll(levelMap.get(i));
        return result;
    }
    
    private static void traverse(Node root) {
        if(root == null)
            return;
        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            if(temp.node.left != null)   queue.add(new Pair(temp.node.left,temp.distance-1));
            if(temp.node.right != null)   queue.add(new Pair(temp.node.right,temp.distance+1));
            if(levelMap.containsKey(temp.distance))
                levelMap.get(temp.distance).add(temp.node.data);
            else{
                ArrayList<Integer> array = new ArrayList<Integer>();
                array.add(temp.node.data);
                levelMap.put(temp.distance,array);
            }
            if(temp.distance < 0)
                minDist = Math.min(minDist,temp.distance);
            else
                maxDist = Math.max(maxDist,temp.distance);
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Vertical traversal of Binary Tree");
	}

}
