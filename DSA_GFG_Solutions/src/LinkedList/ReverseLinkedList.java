package LinkedList;

import LinkedList.BasicOperations.Node;

public class ReverseLinkedList {

	static Node reverseList(Node head) {
        Node t1= null;
        Node t2 = null;
        while(head != null){
            t2 = head.next;
            head.next = t1;
            t1 = head;
            head = t2;
        }
        return t1;
    }
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 11);
		head = basic.insertAtEnd(head, 17);
		basic.displayData(reverseList(head));
	}

}
