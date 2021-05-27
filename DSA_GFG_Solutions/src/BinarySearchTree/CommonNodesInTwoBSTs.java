package BinarySearchTree;

import java.util.ArrayList;

public class CommonNodesInTwoBSTs {
	
	class Node  { 
	     int data; 
	     Node left, right; 

	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	public static ArrayList<Integer> findCommon(Node root1,Node root2){
	    ArrayList<Integer> result = new ArrayList<Integer>();
        if(root1 == null || root2 == null)
            return result;
        result.addAll(findCommon(root1,root2.left));
        if(search(root1,root2.data))
            result.add(root2.data);
        result.addAll(findCommon(root1,root2.right));
        return result;
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
}
