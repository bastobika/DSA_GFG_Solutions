package Tree;

import java.util.ArrayDeque;

public class MaxWidth {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static int getMaxWidth(Node root) {
        if(root == null)
            return 0;
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        queue.offer(root);
        int maxWidth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            maxWidth = Math.max(maxWidth,size);
            for(int i=0;i<size;i++){
                Node element = queue.poll();
                if(element.left != null) queue.offer(element.left);
                if(element.right != null) queue.offer(element.right);
            }
        }
        return maxWidth;
    }
	
	public static void main(String[] args) {
		System.out.println("Maximum width of tree is " + getMaxWidth(null));
	}

}
