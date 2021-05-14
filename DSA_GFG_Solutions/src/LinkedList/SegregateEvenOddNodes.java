package LinkedList;

import LinkedList.BasicOperations.Node;

public class SegregateEvenOddNodes {

	private static Node segregateEvenOddNodes(Node head, int n) {
		Node odd = null;
		Node even = null;
		Node oddEnd = null;
		Node evenEnd = null;
		Node temp = head;
		BasicOperations basic = new BasicOperations();
		while(temp != null) {
			if(temp.data % 2 == 0) {
				if(even == null) {
					even = basic.new Node(temp.data);
					evenEnd = even;
				}else {
					evenEnd.next = basic.new Node(temp.data);
					evenEnd = evenEnd.next;
				}
			}else {
				if(odd == null) {
					odd = basic.new Node(temp.data);
					oddEnd = odd;
				}else {
					oddEnd.next = basic.new Node(temp.data);
					oddEnd = oddEnd.next;
				}
			}
			temp = temp.next;
		}
		if(even == null)
				return odd;
		evenEnd.next = odd;
		return even;
	}
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtBeginning(head, 10);
		head = basic.insertAtEnd(head, 17);
		head = basic.insertInMid(head, 51);
		head = basic.insertAtEnd(head, 18);
		head = basic.insertInMid(head, 50);
		head = segregateEvenOddNodes(head,7);
		basic.displayData(head);
	}

}
