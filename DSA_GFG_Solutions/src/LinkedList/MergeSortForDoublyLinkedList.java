package LinkedList;

public class MergeSortForDoublyLinkedList {

	class Node {
	    int data;
	    Node next, prev;
	    Node(int data) {
	        this.data = data;
	        next = prev = null;
	    }
	}
	
	static Node sortDoubly(Node head){
        if(head.next == null)
            return head;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        temp.prev = null;
        slow.next = null;
        Node left = sortDoubly(head);
        Node right = sortDoubly(temp);
        return merge(left,right);
    }
    
    private static Node merge(Node left,Node right){
        Node head = left.data > right.data ? right : left;
        Node temp1 = head == left ? right : left;
        Node temp2 = head.next;
        Node traverse = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data > temp2.data){
                traverse.next = temp2;
                temp2.prev = traverse;
                temp2 = temp2.next;
            }else{
                traverse.next = temp1;
                temp1.prev = traverse;
                temp1 = temp1.next;
            }
            traverse = traverse.next;
        }
        if(temp1 != null){
            traverse.next = temp1;
            temp1.prev = traverse;
        }
        if(temp2 != null){
            traverse.next = temp2;
            temp2.prev = traverse;
        }
        return head;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
