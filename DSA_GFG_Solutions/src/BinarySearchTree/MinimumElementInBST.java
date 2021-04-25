package BinarySearchTree;

public class MinimumElementInBST {

	class Node  { 
	     int data; 
	     Node left, right; 
 
	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	static int minValue(Node node){
        if(node == null)
            return -1;
        while(node.left != null)
            node = node.left;
        return node.data;
    }
	
	public static void main(String[] args) {
		System.out.println("Minimum element in a BST " + minValue(null));
	}

}
