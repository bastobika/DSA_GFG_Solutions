package BinarySearchTree;

import java.util.ArrayList;

public class BSTElementsInARange {

	class Node {
	    int data;
	    Node left;
	    Node right;
	    Node(int data) {
	        this.data = data;
	        left=null;
	        right=null;
	    }
	}
	
	public static ArrayList<Integer> printNearNodes(Node root, int low, int high){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        if(root.data >= low && root.data <= high){
            result.addAll(printNearNodes(root.left,low,high));
            result.add(root.data);
            result.addAll(printNearNodes(root.right,low,high));
        }
        if(root.data < low)
            result.addAll(printNearNodes(root.right,low,high));
        if(root.data > high)
            result.addAll(printNearNodes(root.left,low,high));
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("The BST elements in the given range are");
	}

}
