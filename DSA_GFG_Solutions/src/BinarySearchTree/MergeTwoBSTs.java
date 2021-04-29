package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBSTs {

	class Node  { 
	     int data; 
	     Node left, right; 
 
	     public Node(int d)  { 
	         data = d; 
	         left = right = null; 
	     } 
	 }
	
	public List<Integer> merge(Node root1,Node root2){
        if(root1 == null)   
            return inOrder(root2);
        if(root2 == null)
            return inOrder(root1);
        Node root = mergeInorder(root1,root2);
        return inOrder(root);
    }
    
    private static Node mergeInorder(Node root1,Node root2){
        if(root2 == null)
            return root1;
        root1 = mergeInorder(root1,root2.left);
        root1 = insert(root1,root2.data);
        root1 = mergeInorder(root1,root2.right);
        return root1;
    }
    
    private static Node insert(Node root,int key){
        if(root == null){
        	MergeTwoBSTs obj = new MergeTwoBSTs();
            Node temp = obj.new Node(key);
            return temp;
        }
        if(root.data >= key)
            root.left = insert(root.left,key);
        if(root.data < key)
            root.right = insert(root.right,key);
        return root;
    }
    
    private static ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        result.addAll(inOrder(root.left));
        result.add(root.data);
        result.addAll(inOrder(root.right));
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
