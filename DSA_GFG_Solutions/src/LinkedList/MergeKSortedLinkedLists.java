package LinkedList;

import LinkedList.BasicOperations.Node;

public class MergeKSortedLinkedLists {

	static Node mergeKList(Node[]arr,int K) {
        Node sorted = null;
        for(int i=0;i<K;i++)
            sorted = merge(sorted,arr[i]);
        return sorted;
    }
    
    private static Node merge(Node a,Node b){
        if(a == null)   
            return b;
        Node head = a.data > b.data ? b : a;
        Node temp1 = head == a ? b : a;
        Node temp2 = head.next;
        Node traverse = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data > temp2.data){
                traverse.next = temp2;
                temp2 = temp2.next;
            }else{
                traverse.next = temp1;
                temp1 = temp1.next;
            }
            traverse = traverse.next;
        }
        if(temp1 != null)
            traverse.next = temp1;
        if(temp2 != null)
            traverse.next = temp2;
        return head;
    }
    
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head1 = basic.insertAtBeginning(null, 1);
		head1 = basic.insertAtEnd(head1, 2);
		head1 = basic.insertAtEnd(head1, 3);
		head1 = basic.insertAtEnd(head1, 4);
		Node head2 = basic.insertAtBeginning(null, 2);
		head2 = basic.insertAtEnd(head2, 3);
		head2 = basic.insertAtEnd(head2, 6);
		Node head3 = basic.insertAtBeginning(null, 5);
		head3 = basic.insertAtEnd(head3, 6);
		head3 = basic.insertAtEnd(head3, 7);
		head3 = basic.insertAtEnd(head3, 8);
		head3 = basic.insertAtEnd(head3, 10);
		Node arr[] = {head1,head2,head3};
		basic.displayData(mergeKList(arr,3));
	}

}
