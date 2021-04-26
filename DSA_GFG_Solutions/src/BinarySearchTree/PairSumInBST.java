package BinarySearchTree;

import java.util.HashSet;

public class PairSumInBST {

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
	
	private static HashSet<Integer> set = new HashSet<Integer>();
	
    static boolean findPair(Node root, int X) {
        boolean isAvailable = find(root,X);
        set.clear();
        return isAvailable;
    }
    
    private static boolean find(Node root,int X){
        if(root == null)
            return false;
        boolean flag = false;
        boolean left = false; 
        boolean right = false;
        if(X < root.data)
            left = findPair(root.left,X);
        else if(X > root.data){
            if(!set.contains(X-root.data))
                set.add(root.data);
            else
                flag = true;
            left = find(root.left,X);
            right = find(root.right,X);
        }
        return flag || left || right;
    }
    
	public static void main(String[] args) {
		System.out.println("Is pair present ? " + findPair(null,10));
	}

}
