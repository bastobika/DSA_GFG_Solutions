package LinkedList;

import LinkedList.BasicOperations.Node;

public class LoopsInLinkedList {

	public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
	
	static int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                int count = 0;
                while(fast.next != slow){
                    fast = fast.next;
                    count++;
                }
                return count+1;
            }
        }
        return 0;
    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 11);
		head = basic.insertAtEnd(head, 17);
		Node loopPoint = head.next.next;
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = loopPoint;
		System.out.println("Does Loop Exists ? : "+detectLoop(head));
		System.out.println("Number of nodes in the loop : "+countNodesinLoop(head));
	}

}
