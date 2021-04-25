package BinarySearchTree;

public class CeilInBST {

	class Node  { 
	     int data; 
	     Node left, right; 

	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	static int findCeil(Node root, int key) { 
        if (root == null)
            return -1;
        int ceil = Integer.MAX_VALUE;
        while(root != null){
            if(root.data == key)    return key;
            if(root.data > key){
                ceil = Math.min(root.data,ceil);
                root = root.left;
            }
            if(root != null && root.data < key)
                root = root.right;

        }
        return ceil == Integer.MAX_VALUE ? -1 : ceil;
    } 
	
	public static void main(String[] args) {
		System.out.println("Ceil of X in BST is " + findCeil(null,5));
	}

}
