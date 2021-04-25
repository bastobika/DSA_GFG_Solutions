package BinarySearchTree;

public class DeleteNodeFromBST {

	class Node  { 
	     int data; 
	     Node left, right; 

	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 } 
	
	public static Node deleteNode(Node root, int X) {
		if(root == null)
		    return null;
		if(root.data == X){
		    if(root.left == null && root.right == null)
		        return null;
		    else{
		        Node temp = root.right;
		        while(temp.left != null)
		            temp = temp.left;
		        temp.left = root.left;
		        return root.right;
		    }
		}
		if(root.data > X)
		    root.left = deleteNode(root.left,X);
		else
		    root.right = deleteNode(root.right,X);
		return root;
	}
	
	public static void main(String[] args) {
		System.out.println("Delete x from a BST " + deleteNode(null,6));
	}

}
