package Tree;

public class MirrorTree {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static void mirror(Node node) {
        if(node == null)
            return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }
	
	public static void main(String[] args) {
		System.out.println("Mirrored tree ");
	}

}
