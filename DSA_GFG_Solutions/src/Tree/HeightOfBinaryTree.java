package Tree;

public class HeightOfBinaryTree {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static int height(Node root) {
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
	
	public static void main(String[] args) {
		System.out.println("Height of Binary Tree = " + height(null));
	}

}
