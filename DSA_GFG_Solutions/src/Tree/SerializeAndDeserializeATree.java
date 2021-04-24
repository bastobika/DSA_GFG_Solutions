package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class SerializeAndDeserializeATree {

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
	
	public void serialize(Node root, ArrayList<Integer> A) {
	    if(root == null)
	        return;
	    Node temp = new Node(-1);
	    ArrayDeque<Node> queue = new ArrayDeque<Node>();
	    queue.offer(root);
	    while(!queue.isEmpty()){
	        boolean end = false;
	        int size = queue.size();
	        for(int i=0;i<size;i++){
	            Node element = queue.poll();
	            A.add(element.data);
	            if(element.data != -1){
	                end = true;
    	            queue.offer(element.left == null ? temp : element.left);
    	            queue.offer(element.right == null ? temp : element.right);
	            }
	        }
	        if(!end)
	            break;
	    }
	}
	
    public Node deSerialize(ArrayList<Integer> A) {
        if(A.size() == 0)
            return null;
        Node root = new Node(A.get(0));
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
	    queue.offer(root);
	    int i=1;
        while(!queue.isEmpty()){
            Node element = queue.poll();
            if(i >= A.size())
                break;
            if(element.data != -1){
                element.left = (i < A.size()) && (A.get(i) == -1) ? null : new Node(A.get(i));
                element.right = (i+1 < A.size()) && (A.get(i+1) == -1) ? null : new Node(A.get(i+1));
                if(element.left != null)
                    queue.offer(element.left);
    	        if(element.right != null)
    	            queue.offer(element.right);
            }
            i += 2;
        } 
	    return root;
    }
	public static void main(String[] args) {
		System.out.println("To serialize and deserialize a tree");
	}

}
