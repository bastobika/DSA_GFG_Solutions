package BinarySearchTree;

public class CheckForBST {

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
	
	private static Node prev = null;
	
	static boolean isBST(Node root) {
        if(root == null)
            return true;
        return checkInorder(root).data == -1 ? false : true;
    }
    
    static Node checkInorder(Node root){
        if(root == null)
            return null;
        if(root.data != -1){
            root.left = checkInorder(root.left);
            if(root.left != null && root.left.data == -1)
                return root.left;
            if(prev != null && prev.data >= root.data) {
            	CheckForBST bst = new CheckForBST();
                return bst.new Node(-1);
            }
            prev = root;
            root.right = checkInorder(root.right);
            if(root.right != null && root.right.data == -1)
                return root.right;
        }
        return root;
    }
    
	public static void main(String[] args) {
		System.out.println("Is the tree a BST ? " + isBST(null));
	}

}
