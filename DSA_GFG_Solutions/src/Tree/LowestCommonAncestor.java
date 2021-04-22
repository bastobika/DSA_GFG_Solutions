package Tree;

public class LowestCommonAncestor {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static Node lca(Node root, int n1,int n2) {
		if(root == null)
		    return null;
		if(root.data == n1 || root.data == n2) 
		    return root;
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		if(left == null && right == null)   return null;
		if(left != null && right == null)   return left;
		if(right != null && left == null)   return right;
		return root;
	}
	
	public static void main(String[] args) {
		System.out.println("Lowest Common Ancestor of the two nodes are " + lca(null,4,5));
	}

}
