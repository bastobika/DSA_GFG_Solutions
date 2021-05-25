package Tree;

public class FoldableBinaryTree {
	
	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	boolean IsFoldable(Node node) { 
        if(node == null)
            return true;
		return equals(node.left,node.right);
	} 
	
	private boolean equals(Node root1,Node root2) {
	    if(root1 == null && root2 == null)
	        return true;
	    if((root1 == null && root2 != null) || (root1 != null && root2 == null))
	        return false;
	    return equals(root1.left,root2.right) && equals(root1.right,root2.left);
	}
	
	public static void main(String[] args) {
		System.out.println("Foldable Binary Tree");
	}

}
