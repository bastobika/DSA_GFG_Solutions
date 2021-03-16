package LinkedList;

import LinkedList.BasicOperations.Node;

public class AddTwoNumbersRepresentedByLists {

	static Node reverseList(Node head) {
        Node t1= null;
        Node t2 = null;
        while(head != null){
            t2 = head.next;
            head.next = t1;
            t1 = head;
            head = t2;
        }
        return t1;
    }
    
    static Node addTwoLists(Node first, Node second,BasicOperations basic){
        first = reverseList(first);
        second = reverseList(second);
        Node result = null; Node temp = null; int carry = 0;
        while(first != null && second != null){
            temp = basic.new Node((first.data+second.data+carry)%10);
            carry = (first.data+second.data+carry)/10;
            temp.next = result;
            result = temp;
            first = first.next;
            second = second.next;
        }
        Node rem = null;
        if(first == null)
            rem = second;
        else
            rem = first;
        while(rem != null){
            temp = basic.new Node((rem.data+carry)%10);
            carry = (rem.data+carry)/10;
            temp.next = result;
            result = temp;
            rem = rem.next;
        }
        while(carry > 0){
            temp = basic.new Node(carry);
            temp.next = result;
            result = temp;
            carry = carry/10;
        }
        return result;
    }
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 4);
		head = basic.insertAtEnd(head, 5);
		Node head2 = basic.insertAtBeginning(null, 3);
		head2 = basic.insertAtEnd(head2, 4);
		head2 = basic.insertAtEnd(head2, 5);
		basic.displayData(addTwoLists(head,head2,basic));
	}

}
