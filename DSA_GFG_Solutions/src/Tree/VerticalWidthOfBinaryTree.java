package Tree;

public class VerticalWidthOfBinaryTree {

	class Node {
	    int data;
	    Node left;
	    Node right;

	    Node(int value) {
	        data = value;
	        left = null;
	        right = null;
	    }
	}
	
	private static int minLeft;
    private static int maxRight;
    
    public static int verticalWidth(Node root)	{
        if(root == null)
            return 0;
	    minLeft = 0;
	    maxRight = 0;
	    width(root,0);
	    return (maxRight-minLeft+1);
	}
	
	private static void width(Node root,int current) {
	    if(root == null)
	        return;
	    if(current < 0)
	        minLeft = Math.min(minLeft,current);
	    else
	        maxRight = Math.max(maxRight,current);
	    width(root.left,current-1);
	    width(root.right,current+1);
	}
	
	public static void main(String[] args) {
		System.out.println("Vertical width of Binary Tree");
	}

}
