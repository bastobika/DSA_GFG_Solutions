package Tree;

import java.util.ArrayList;

public class Traversals {

	class Node {
	     int data;
         Node left,right;
	     Node(int d) {
	         data=d;
	         left=right=null;
          }
	 }
	static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        result.add(root.data);
        result.addAll(preOrder(root.left));
        result.addAll(preOrder(root.right));
        return result;
    }
	
	 static ArrayList<Integer> inOrder(Node root) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        if(root == null)
	            return result;
	        result.addAll(inOrder(root.left));
	        result.add(root.data);
	        result.addAll(inOrder(root.right));
	        return result;
	    }
	 
	 static ArrayList<Integer> postOrder(Node root) {
	       ArrayList<Integer> result = new ArrayList<Integer>();
	        if(root == null)
	            return result;
	        result.addAll(postOrder(root.left));
	        result.addAll(postOrder(root.right));
	        result.add(root.data);
	        return result;
	    }
	
	public static void main(String[] args) {
		System.out.println("Inorder Traversal : " + inOrder(null));
		System.out.println("Preorder Traversal : " + preOrder(null));
		System.out.println("Postorder Traversal : " + postOrder(null));
	}

}
