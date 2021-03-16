package LinkedList;

import java.util.HashSet;
import java.util.Set;

import LinkedList.BasicOperations.Node;

public class RemoveDuplicatesFromUnsortedList {

	public static Node removeDuplicates(Node head) {
        Node temp = head;
        Set<Integer> set = new HashSet<Integer>();
        set.add(head.data);
	    while(temp.next != null){
	        while(temp.next != null && set.contains(temp.next.data))
	               temp.next = temp.next.next;
	        if(temp.next != null){
	            set.add(temp.next.data);
	            temp = temp.next;
	        }
	    }
	    return head;
    }
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 5);
		head = basic.insertAtEnd(head, 10);
		head = removeDuplicates(head);
		basic.displayData(head);

	}

}
