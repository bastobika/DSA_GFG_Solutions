package Tree;

import Tree.BinaryTreeToDLL.Node;

public class BinaryTreeToCDLL {

	class Node {
		Node left, right;
		int data;
		
		Node(int d) {
			data = d;
			left = right = null;
		}	
	}
	
	Node head;
    Node prev;
    
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root) {
        this.head = null;
	    this.prev = null;
	    convert(root);
	    this.head.left = this.prev;
	    this.prev.right = this.head;
	    return this.head;
    }
    
     private void convert(Node root) {
        if(root == null)
	        return;
	    convert(root.left);
	    if(this.head == null)
	        this.head = root;
	    root.left = prev;
	    if(this.prev != null)
	        this.prev.right = root;
	    this.prev = root;
	    convert(root.right);   
    }
     
	public static void main(String[] args) {
		System.out.println("Binary Tree to CDLL");
	}

}
