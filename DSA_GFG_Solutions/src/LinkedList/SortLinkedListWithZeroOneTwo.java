package LinkedList;

import LinkedList.BasicOperations.Node;

public class SortLinkedListWithZeroOneTwo {

	static Node segregate(Node head, BasicOperations bo) {
        Node traverse = head;
        Node head0 = null;
        Node head1 = null;
        Node head2 = null;
        Node tail0 = null;
        Node tail1 = null;
        Node tail2 = null;
        while(traverse != null){
            Node dummy = bo.new Node(traverse.data);
            if(traverse.data == 0){
                if(head0 == null){
                    head0 = dummy;
                    tail0 = head0;
                }else{
                    tail0.next = dummy;
                    tail0 = tail0.next;
                }
            }
            if(traverse.data == 1){
                if(head1 == null){
                    head1 = dummy;
                    tail1 = head1;
                }else{
                    tail1.next = dummy;
                    tail1 = tail1.next;
                }
            }
            if(traverse.data == 2){
                if(head2 == null){
                    head2 = dummy;
                    tail2 = head2;
                }else{
                    tail2.next = dummy;
                    tail2 = tail2.next;
                }
            }
            traverse = traverse.next;
        }
        if(tail0 != null)
            tail0.next = head1;
        if(tail1 != null)
            tail1.next = head2;
        else if(tail0 != null)
            tail0.next = head2;
        if(head0 != null) 
            return head0;
        else if(head1 != null) 
            return head1;
        return head2;
    }
	
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 2);
		head = basic.insertAtEnd(head, 1);
		head = basic.insertAtEnd(head, 0);
		head = basic.insertAtEnd(head, 1);
		basic.displayData(segregate(head,basic));
	}

}
