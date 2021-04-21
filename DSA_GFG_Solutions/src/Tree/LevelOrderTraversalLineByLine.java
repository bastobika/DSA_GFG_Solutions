package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelOrderTraversalLineByLine {

	class Node {
	    int data;
	    Node left, right;

	    Node(int item) {
	        data = item;
	        left = right = null;
	    }
	}
	
	static ArrayList<ArrayList<Integer>> levelOrderByLine(Node node)  {
       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
       if(node == null)
           return result;
       ArrayDeque<Node> queue = new ArrayDeque<Node>();
       queue.offer(node);
       while(!queue.isEmpty()){
           ArrayList<Integer> subResult = new ArrayList<Integer>();
           int size = queue.size();
           for(int i=0;i<size;i++){
               Node element = queue.poll();
               subResult.add(element.data);
               if(element.left != null) queue.offer(element.left);
               if(element.right != null) queue.offer(element.right);
           }
           result.add(subResult);
       }
       return result;
   }
	
	public static void main(String[] args) {
		System.out.println("Level order traversal " + levelOrderByLine(null));
	}
}
