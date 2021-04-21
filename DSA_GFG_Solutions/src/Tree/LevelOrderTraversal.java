package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrderTraversal {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static ArrayList <Integer> levelOrder(Node node) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(node == null)
            return result;
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        queue.offer(node);
        while(!queue.isEmpty()){
            Node element = queue.poll();
            result.add(element.data);
            if(element.left != null) queue.offer(element.left);
            if(element.right != null) queue.offer(element.right);
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Level order traversal " + levelOrder(null));
	}

}
