package Tree;

public class BinaryTreeToDLL {
	
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
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root) {
	    this.head = null;
	    this.prev = null;
	    convert(root);
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
		System.out.println("Binary Tree to DLL");
	}

}
