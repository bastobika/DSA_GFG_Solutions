package BinarySearchTree;

public class LevelOrderToBST {

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
	
	public Node constructBST(int[] arr){
        Node root = arr.length > 0 ? new Node(arr[0]) : null;
        for(int i=1;i<arr.length;i++)
            insert(root,arr[i]);
        return root;
    }
    
    private Node insert(Node root,int x) {
        if(root == null)
            return new Node(x);
        if(root.data > x)
            root.left = insert(root.left,x);
        if(root.data < x)
            root.right = insert(root.right,x);
        return root;
    }
    
	public static void main(String[] args) {
		System.out.println("Level order to BST");
	}

}
