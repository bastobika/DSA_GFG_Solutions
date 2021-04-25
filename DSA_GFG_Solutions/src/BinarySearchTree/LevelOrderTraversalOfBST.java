package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrderTraversalOfBST {

	class Node {
	    int data;
	    Node left;
	    Node right;
	}
	
	static ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node element = queue.poll();
            result.add(element.data);
            if(element.left != null)    queue.offer(element.left);
            if(element.right != null)   queue.offer(element.right);
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Level Order Traversal of BST");
	}

}
