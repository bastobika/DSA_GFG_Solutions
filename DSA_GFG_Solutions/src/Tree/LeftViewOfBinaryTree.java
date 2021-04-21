package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LeftViewOfBinaryTree {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        if(root == null)
            return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node elem = queue.poll();
                if(i == 0)  result.add(elem.data);
                if(elem.left != null) queue.offer(elem.left);
                if(elem.right != null) queue.offer(elem.right);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Left view of Binary Tree " + leftView(null));
	}

}
