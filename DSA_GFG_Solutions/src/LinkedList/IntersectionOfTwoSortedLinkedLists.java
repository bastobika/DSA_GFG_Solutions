package LinkedList;

import LinkedList.BasicOperations.Node;

public class IntersectionOfTwoSortedLinkedLists {

	public static Node findIntersection(Node headA, Node headB) {
        Node newHead = null;
        Node temp = null;
        BasicOperations obj = new BasicOperations();
        while(headA != null && headB != null){
            if(headA.data == headB.data){
                if(newHead == null){
                    newHead = obj.new Node(headA.data);
                    temp = newHead;
                }else{
                    temp.next = obj.new Node(headA.data);
                    temp = temp.next;
                }
                headA = headA.next;
                headB = headB.next;
            }
            else if(headA.data > headB.data)
                headB = headB.next;
            else
                headA = headA.next;
        }
        return newHead;
    }
	
	public static void main(String[] args) {
		System.out.println("Intersection of two Linked Lists");
	}

}
