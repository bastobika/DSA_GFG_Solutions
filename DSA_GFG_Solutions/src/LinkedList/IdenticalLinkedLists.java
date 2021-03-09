package LinkedList;

import LinkedList.BasicOperations;
import LinkedList.BasicOperations.Node;

public class IdenticalLinkedLists {
	    
	public static boolean isIdentical (Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data)
                return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 != null || temp2 != null)
            return false;
        return true;
    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head1 = basic.insertAtBeginning(null, 5);
		head1 = basic.insertAtEnd(head1, 9);
		head1 = basic.insertAtBeginning(head1, 10);
		Node head2 = basic.insertAtBeginning(null, 5);
		head2 = basic.insertAtEnd(head2, 9);
		head2 = basic.insertAtBeginning(head2, 10);
		System.out.println(isIdentical(head1,head2));
	}

}
