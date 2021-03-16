package LinkedList;

import LinkedList.BasicOperations.Node;

public class RotateALinkedList {

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
	
	static Node rotateUsingReverseList(Node head,int k) {
		Node temp = head;
        for(int i=1;i<k;i++)
            temp = temp.next;
        Node temp2 = reverseList(temp.next);
        temp.next = null;
        head = reverseList(head);
        temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = temp2;
        return reverseList(head);
	}
	
	static Node rotateList(Node head,int k) {
		Node temp1 = head; k--;
        while(temp1.next != null)
            temp1 = temp1.next;
        temp1.next = head;
        while(k != 0){
            head = head.next;
            k--;
        }
        temp1 = head;
        head = head.next;
        temp1.next = null;
        return head;
	}
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 11);
		head = basic.insertAtEnd(head, 17);
		System.out.println("Rotate using reverse list concept :");
		basic.displayData(rotateUsingReverseList(head,3));
		head = null;
		head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 11);
		head = basic.insertAtEnd(head, 17);
		System.out.println("Simple rotate :");
		basic.displayData(rotateList(head,3));
	}
}
