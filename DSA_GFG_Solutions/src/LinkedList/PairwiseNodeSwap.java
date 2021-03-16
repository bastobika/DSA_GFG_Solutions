package LinkedList;

import LinkedList.BasicOperations.Node;

public class PairwiseNodeSwap {

	public static Node pairwise_swap(Node head)
    {
        Node temp1 = head;
        Node temp2 = head.next;
        Node prev = null;
        while(temp1 != null && temp2 != null){
            if(temp1 == head)
                head = temp2;
            if(prev != null)
                prev.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;
            prev = temp1;
            temp1 = temp1.next;
            if(temp1 != null)
                temp2 = temp1.next;
        }
        return head;
    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 11);
		head = basic.insertAtEnd(head, 17);
		basic.displayData(pairwise_swap(head));
	}

}
