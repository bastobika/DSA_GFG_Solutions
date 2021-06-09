package BinarySearchTree;

public class CheckIfBSTHasDeadEnd {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=right=null;
	    }
	} 
	
	public static boolean isDeadEnd(Node root){
        return !checkLimits(root,0,Integer.MAX_VALUE);
    }
    
    private static boolean checkLimits(Node root,int low,int high){
        if(root == null)
            return true;
        return (root.data-low > 1 || high-root.data > 1)
                && checkLimits(root.left,low,root.data) && checkLimits(root.right,root.data,high);
    }
    
	public static void main(String[] args) {
		System.out.println("Check if BST has dead end");
	}

}
