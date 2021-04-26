package BinarySearchTree;

public class LowestCommonAncestorBST {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static Node LCA(Node root, int n1, int n2)	{
        if(root == null)
		    return null;
	    if(root.data > n1 && root.data > n2)
		    return LCA(root.left,n1,n2);
		else if(root.data < n1 && root.data < n2)
		    return LCA(root.right,n1,n2);
		return root; 
    }
	
	public static void main(String[] args) {
		System.out.println("Lowest Common Ancestor of the two nodes are " + LCA(null,4,5));
	}

}
