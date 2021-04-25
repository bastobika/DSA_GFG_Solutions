package BinarySearchTree;

import java.util.ArrayList;

public class InOrderTraversalOfBST {

	class Node {
	    int data;
	    Node left;
	    Node right;
	}
	
	ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        result.addAll(inOrder(root.left));
        result.add(root.data);
        result.addAll(inOrder(root.right));
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Inorder Traversal of BST");
	}

}
