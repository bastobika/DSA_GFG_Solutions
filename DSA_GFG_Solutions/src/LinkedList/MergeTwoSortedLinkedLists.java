package LinkedList;

import LinkedList.BasicOperations.Node;

public class MergeTwoSortedLinkedLists {

	static Node sortedMerge(Node headA, Node headB) {
        Node result = null;
        Node compare = null;
        if(headA.data > headB.data){
            result = headB;
            compare = headA;
        }else{
            result = headA;
            compare = headB;
        }
        Node traverse = result;
        Node temp = null;
        while(traverse.next != null){
            if(traverse.next.data > compare.data){
                temp = compare;
                compare = traverse.next;
                traverse.next = temp;
            }
            traverse = traverse.next;
        }
        traverse.next = compare;
        return result;
   }
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node headA = basic.insertAtBeginning(null, 5);
		headA = basic.insertAtEnd(headA, 10);
		headA = basic.insertAtEnd(headA, 20);
		headA = basic.insertAtEnd(headA, 40);
		Node headB = basic.insertAtBeginning(null, 2);
		headB = basic.insertAtEnd(headB, 3);
		headB = basic.insertAtEnd(headB, 20);
		headB = basic.insertAtEnd(headB, 30);
		basic.displayData(sortedMerge(headA,headB));
	}

}
