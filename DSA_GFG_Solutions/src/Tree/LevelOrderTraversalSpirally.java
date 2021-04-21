package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrderTraversalSpirally {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static ArrayList<Integer> findSpiral(Node node) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(node == null)
            return result;
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        queue.offer(node);
        int level = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                if(level%2 != 0){
                    Node element = queue.pollLast();
                    result.add(element.data);
                    if(element.right != null) queue.offerFirst(element.right);
                    if(element.left != null) queue.offerFirst(element.left);
                }else{
                    Node element = queue.pollFirst();
                    result.add(element.data);
                    if(element.left != null) queue.offerLast(element.left);
                    if(element.right != null) queue.offerLast(element.right);
                }
            }
            level++;
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Level order traversal of tree in spiral form " + findSpiral(null));
	}

}
