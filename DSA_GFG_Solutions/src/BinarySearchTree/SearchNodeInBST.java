package BinarySearchTree;

public class SearchNodeInBST {

	class Node  { 
	     int data; 
	     Node left, right; 

	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	static boolean search(Node root, int x){
	    if(root == null)    
	        return false;
	    if(root.data == x)
	        return true;
	    if(root.data > x)
	        return search(root.left,x);
	    return search(root.right,x);
    }
	
	public static void main(String[] args) {
		System.out.println("X is present in BST " + search(null,8));
	}

}
