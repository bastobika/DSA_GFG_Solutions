package LinkedList;

import LinkedList.BasicOperations.Node;

public class RemoveDuplicatesfromSortedList {

	 static Node removeDuplicates(Node root)
	    {
		    Node temp = root;
		    while(temp != null){
		        Node temp2 = temp.next;
		        while(temp2 != null && temp2.data == temp.data)
		            temp2 = temp2.next;
		        temp.next = temp2;
		        temp = temp.next;
		    }
		    return root;
	    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 10);
		head = removeDuplicates(head);
		basic.displayData(head);
	}

}
