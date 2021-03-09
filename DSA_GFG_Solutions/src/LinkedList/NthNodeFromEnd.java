package LinkedList;

import LinkedList.BasicOperations.Node;

public class NthNodeFromEnd {

	static int getNthFromLast(Node head, int n) {
    	Node temp1 = head;
    	for(int i=0;i<n;i++){
    	    if(temp1 == null)
    	        return -1;
    	    temp1 = temp1.next;
    	}
    	Node temp2 = head;
    	while(temp1 != null){
    	    temp1 = temp1.next;
    	    temp2 = temp2.next;
    	}
    	return temp2.data;
    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 11);
		head = basic.insertAtEnd(head, 17);
		System.out.println(getNthFromLast(head,2));
		System.out.println(getNthFromLast(head,10));
	}

}
