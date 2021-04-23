package Tree;

import java.util.ArrayDeque;

public class ConnectNodesAtSameLevel {

	static class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data) {
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
	}
	
	public static void connect(Node root) {
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        if(root == null)
            return;
        Node temp = new Node(-1);
        queue.offer(root);
        queue.offer(temp);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size-1;i++){
                Node element = queue.poll();
                element.nextRight = (!queue.isEmpty() && queue.peek() == temp) ? null : queue.peek();
                if(!queue.isEmpty() && queue.peek() == temp) queue.poll();
                if(element.left != null) queue.offer(element.left);
                if(element.right != null) queue.offer(element.right);
            }
            if(!queue.isEmpty()) queue.offer(temp);
        }
    }
	
	public static void main(String[] args) {
		System.out.println("After connecting nodes of same level ");
	}

}
