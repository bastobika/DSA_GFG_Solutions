package LinkedList;

import LinkedList.BasicOperations.Node;

public class IntersectionOfTwoLinkedLists {

	public static int getCount(Node head) {
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
	
	static int intersectPoint(Node head1, Node head2)
	{
        int len1 = getCount(head1);
        int len2 = getCount(head2);
        int diff = Math.abs(len1-len2);
        Node longer = len1 >= len2 ? head1 : head2;
        Node shorter = len1 < len2 ? head1 : head2;
        while(diff > 0){
            longer = longer.next;
            diff--;
        }
        while(longer != null && shorter != null){
            if(longer.next == shorter.next)
                return longer.next.data;
            longer = longer.next;
            shorter = shorter.next;
        }
        return -1;
	}
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head1 = basic.insertAtBeginning(null, 5);
		head1 = basic.insertAtEnd(head1, 9);
		head1 = basic.insertAtBeginning(head1, 10);
		Node head2 = basic.insertAtBeginning(null, 15);
		head2 = basic.insertAtEnd(head2, 14);
		Node head3 = basic.insertAtBeginning(null, 1);
		head3 = basic.insertAtEnd(head3, 19);
		head3 = basic.insertAtBeginning(head3, 21);
		Node temp = head1;
		while(temp.next != null)
			temp = temp.next;
		temp.next = head3;
		temp = head2;
		while(temp.next != null)
				temp  = temp.next;
		temp.next = head3;
		System.out.println(intersectPoint(head1,head2));
	}

}
