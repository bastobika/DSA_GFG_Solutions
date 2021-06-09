package Tree;

public class SumTree {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=right=null;
	    }
	} 
	
	boolean isSumTree(Node root){
        if(checkTree(root) != -1)
            return true;
        return false;
	}
	
	private int checkTree(Node root){
	    if(root == null)
	        return 0;
	    int left = checkTree(root.left);
	    int right = checkTree(root.right);
	    if(left == 0 && right == 0)
	        return root.data;
	    if(left == -1 || right == -1 || root.data != left + right)
	        return -1;
	    return root.data + left + right;
	    
	}
	
	public static void main(String[] args) {
		System.out.println("Sum tree");
	}

}
