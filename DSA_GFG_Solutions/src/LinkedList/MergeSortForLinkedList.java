package LinkedList;

import LinkedList.BasicOperations.Node;

public class MergeSortForLinkedList {
	
	static Node mergeSort(Node head){
        if(head.next == null)
            return head;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(temp);
        return merge(left,right);
    }
    
    private static Node merge(Node left,Node right){
        Node head = left.data > right.data ? right : left;
        Node temp1 = head == left ? right : left;
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
		Node head = basic.insertAtBeginning(null, 10);
		head = basic.insertAtEnd(head, 50);
		head = basic.insertAtEnd(head, 36);
		head = basic.insertAtEnd(head, 25);
		head = basic.insertAtEnd(head, 81);
		basic.displayData(mergeSort(head));
	}

}
