package Tree;

import java.util.ArrayDeque;

public class LeafAtSameLevel {

	class Node {
	    int data;
	    Node left,right;
	    Node(int d) {
	        data=d;
	        left=right=null;
	    }
	} 
	
	boolean check(Node root){
	    if(root == null)
	        return true;
	    ArrayDeque<Node> queue = new ArrayDeque<Node>();
	    queue.add(root);
	    int level = 0;
	    int leafLevel = 0;
	    while(!queue.isEmpty()){
	        int size = queue.size();
	        level++;
	        for(int i=0;i<size;i++){
	            Node element = queue.poll();
	            if(element.left == null && element.right == null){
	                if(leafLevel != 0 && leafLevel != level)
	                    return false;
	                leafLevel = level;
	            }
	            if(element.left != null) queue.add(element.left);
	            if(element.right != null) queue.add(element.right);
	        }
	    }
	    return true;
    }
	
	public static void main(String[] args) {
		System.out.println("Leaf at same level or not");
	}

}
