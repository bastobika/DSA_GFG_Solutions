package Tree;

import java.util.ArrayDeque;

public class BinaryTreeFromLinkedList {

	class Tree {
		int data;
		    Tree left;
		    Tree right;
		    Tree(int d) {
		        data=d;
		        left=null;
		        right=null;
		    }
		}

		class Node {
		    int data;
		    Node next;
		    Node(int d) {
		        data = d;
		        next = null;
		    }
		}
		
	public static Tree convert(Node head, Tree node) {
        if(head == null)
            return node;
        ArrayDeque<Tree> queue = new ArrayDeque<Tree>();
        BinaryTreeFromLinkedList bt = new BinaryTreeFromLinkedList();
        node = bt.new Tree(head.data);
        head = head.next;
        queue.offer(node);
        while(!queue.isEmpty()){
            Tree element = queue.poll();
            if(head != null){
                element.left = bt.new Tree(head.data);
                head = head.next;
                queue.offer(element.left);
            }
            if(head != null){
                element.right = bt.new Tree(head.data) ;
                head = head.next;
                queue.offer(element.right);
            }
            if(head == null)
                break;
        }
        return node;
    }
	
	public static void main(String[] args) {
		System.out.println("Binary Tree from Linked List" + convert(null,null));
	}

}
