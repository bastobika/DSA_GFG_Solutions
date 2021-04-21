package Tree;

public class ChildSumParent {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=right=null;
	    }
	}
	
	public static int isSumProperty(Node root) {
        if(root == null)    
            return 1;
        int sum = root.left == null ? 0 : root.left.data;
        sum += root.right == null ? 0 : root.right.data;
        if((sum == root.data || sum == 0)
            && isSumProperty(root.left) == 1 
            && isSumProperty(root.right) == 1)
            return 1;
        return 0;
    }
	
	public static void main(String[] args) {
		System.out.println("All Parents are sum of their Children " + isSumProperty(null));
	}

}
