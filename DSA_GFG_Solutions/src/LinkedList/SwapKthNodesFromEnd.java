package LinkedList;

import LinkedList.BasicOperations.Node;

public class SwapKthNodesFromEnd {

	static Node swapkthnode(Node head, int N, int K) {
        if(K > N)
            return head;
        Node t1 = head;
        Node t2 = null;
        if(K == 1 || K == N){
            while(t1.next.next != null)
                t1 = t1.next;
            t1.next.next = head.next;
            t2 = t1.next;
            t1.next = head;
            t1.next.next = null;
            head = t2;
            return head;
        }
        t2 = head;
        for(int i=0;i<K-2;i++)
            t1 = t1.next;
        for(int i=0;i<N-K-1;i++)
            t2 = t2.next;
        Node temp = t1.next;
        t1.next = t2.next;
        t2.next = temp;
        t1 = t1.next;
        t2 = t2.next;
        temp = temp.next;
        t2.next = t1.next;
        t1.next = temp;
        return head;
    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtBeginning(head, 10);
		head = basic.insertAtEnd(head, 17);
		head = basic.insertInMid(head, 51);
		head = swapkthnode(head,5,2);
		basic.displayData(head);
	}

}
