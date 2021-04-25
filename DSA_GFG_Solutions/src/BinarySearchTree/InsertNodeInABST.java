package BinarySearchTree;

public class InsertNodeInABST {

	class Node  { 
	     int data; 
	     Node left, right; 
  
	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	static Node insert(Node root, int key) {
        if(root == null){
        	InsertNodeInABST bst = new InsertNodeInABST();
            Node temp = bst.new Node(key);
            return temp;
        }
        if(root.data > key)
            root.left = insert(root.left,key);
        if(root.data < key)
            root.right = insert(root.right,key);
        return root;
    }
	
	public static void main(String[] args) {
		System.out.println("Insert x to BST " + insert(null,7));
	}

}
