package Tree;

public class CheckForBalancedTree {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static boolean isBalanced(Node root) {
    	if(checkHeight(root) == -1)
    	    return false;
    	return true;
    }
    
    private static int checkHeight(Node root){
        if(root == null)
            return 0;
        int heightLeft = checkHeight(root.left);
        int heightRight = checkHeight(root.right);
        if(heightLeft == -1 
            || heightRight == -1 
            || Math.abs(heightLeft - heightRight) > 1)  return -1;
        return Math.max(heightLeft,heightRight) + 1;
        
    }
    
	public static void main(String[] args) {
		System.out.println("Tree is height balanced ? " + isBalanced(null));
	}

}
