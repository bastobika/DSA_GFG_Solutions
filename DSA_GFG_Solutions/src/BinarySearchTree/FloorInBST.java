package BinarySearchTree;

public class FloorInBST {

	class Node  { 
	     int data; 
	     Node left, right; 

	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	static int floor(Node root, int key) { 
        int floor = -1;
        if(root == null)
            return floor;
        while(root != null){
            if(root.data == key)    return key;
            if(root.data > key) root = root.left;
            if(root != null && root.data < key){
                floor = Math.max(root.data,floor);
                root = root.right;
            }
        }
        return floor;
    } 
	
	public static void main(String[] args) {
		System.out.println("Floor of X in BST is " + floor(null,6));
	}

}
