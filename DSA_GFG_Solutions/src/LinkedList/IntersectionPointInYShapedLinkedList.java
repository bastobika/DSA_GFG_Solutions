package LinkedList;

import LinkedList.BasicOperations.Node;

public class IntersectionPointInYShapedLinkedList {

	static int intersectPoint(Node head1, Node head2){
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        Node big = length1 > length2 ? head1 : head2;
        Node small = big == head1 ? head2 : head1;
        for(int i=0;i<Math.abs(length1-length2);i++)
            big = big.next;
        while(big != null){
            if(big.next == small.next)
                return big.next.data;
            big = big.next;
            small = small.next;
        }
        return -1;
	}
	
	private static int getLength(Node head){
	    int count = 0;
	    Node temp = head;
	    while(temp != null){
	        count++;
	        temp = temp.next;
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtBeginning(head, 10);
		head = basic.insertAtEnd(head, 17);
		head = basic.insertInMid(head, 51);
		Node head1 = basic.insertAtBeginning(null, 54);
		head1 = basic.insertAtEnd(head1, 22);
		head1 = basic.insertAtBeginning(head1, 15);
		Node head2 = basic.insertAtBeginning(null, 12);
		head2 = basic.insertAtEnd(head2, 43);
		head2 = basic.insertAtBeginning(head2, 11);
		Node temp = head1;
		while(temp.next != null)
			temp = temp.next;
		temp.next = head2;
		temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = head2;
		System.out.println(intersectPoint(head,head1));
	}

}
