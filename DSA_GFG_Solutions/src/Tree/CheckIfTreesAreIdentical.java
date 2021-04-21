package Tree;

public class CheckIfTreesAreIdentical {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=right=null;
	    }
	} 
	
	static boolean isIdentical(Node root1, Node root2) {
	    if(root1 == null && root2 == null)
	        return true;
	    if((root1 == null && root2 != null) || (root1 != null && root2 == null))
	        return false;
	    if(root1.data != root2.data)
	        return false;
	    return (isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right));
	}
	
	public static void main(String[] args) {
		System.out.println("Two trees are identical " + isIdentical(null,null));
	}

}
