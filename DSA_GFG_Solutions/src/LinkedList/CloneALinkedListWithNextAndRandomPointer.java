package LinkedList;

public class CloneALinkedListWithNextAndRandomPointer {

	class Node {
	    int data;
	    Node next, arb;

	    Node(int d) { 
	        data = d;
	        next = arb = null; 
	        
	    }
	}
	
	Node copyList(Node head) {
        if(head == null)    
            return null;
        Node temp = head;
        while(temp != null){
            Node x = new Node(temp.data);
            x.next = temp.next;
            temp.next = x;
            temp = x.next;
        }
        temp = head;
        while(temp != null){
            if(temp.arb == null)
                temp.next.arb = null;
            else
                temp.next.arb = temp.arb.next;
            temp = temp.next.next;
        }
        Node newHead = head.next;
        temp = head;
        while(temp != null){
            head = temp.next.next;
            if(head != null)
                temp.next.next = head.next;
            else
                temp.next.next = null;
            temp.next = head;
            temp = head;
        }
        return newHead;
    }
	
	public static void main(String[] args) {
		
	}

}
