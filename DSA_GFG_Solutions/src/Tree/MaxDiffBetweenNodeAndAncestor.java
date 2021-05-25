package Tree;

import Tree.FoldableBinaryTree.Node;

public class MaxDiffBetweenNodeAndAncestor {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	int max;
    //Function to return the maximum difference between any node and its ancestor.
    int maxDiff(Node root) {
        if(root == null)
            return 0;
        this.max = Integer.MIN_VALUE;
        findMinSuccessor(root);
        return this.max;
    }
    
    private int findMinSuccessor(Node root) {
        if(root != null && root.left == null && root.right == null)
            return root.data;
        int left = root.left != null ? findMinSuccessor(root.left) : Integer.MAX_VALUE;
        int right = root.right != null ? findMinSuccessor(root.right) : Integer.MAX_VALUE;
        this.max = Math.max(this.max,root.data-Math.min(left,right));
        return Math.min(Math.min(left,right),root.data);
    }
    
	public static void main(String[] args) {
		System.out.println("Maximum Difference Between Node and Ancestor");
	}

}
