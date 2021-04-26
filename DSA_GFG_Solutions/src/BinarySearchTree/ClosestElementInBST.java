package BinarySearchTree;

public class ClosestElementInBST {

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
	
	static int minDiff(Node  root, int K) { 
        if(root == null)
            return Integer.MAX_VALUE;
        if(root.data == K)
            return 0;
        if(root.data > K)
            return Math.min(Math.abs(root.data-K),minDiff(root.left,K));
        return Math.min(Math.abs(root.data-K),minDiff(root.right,K));
    }
	
	public static void main(String[] args) {
		System.out.println("Closest element to X in the BST is " + minDiff(null,8));
	}

}
