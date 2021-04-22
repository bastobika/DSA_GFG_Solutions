package Tree;

import Tree.LowestCommonAncestor.Node;

public class DiameterOfBinaryTree {

	private static int diameter;
	
	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
    static int diameter(Node root) {
       diameter = 0;
        height(root);
        return diameter;
    }
    
    static int height(Node root) {
        if(root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter,leftHeight + rightHeight + 1);
        return Math.max(leftHeight,rightHeight) + 1;
    }
    
	public static void main(String[] args) {
		System.out.println("Diameter of Binary Tree is " + diameter(null));
	}

}
