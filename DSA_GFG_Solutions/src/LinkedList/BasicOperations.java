package LinkedList;

public class BasicOperations {

	class Node{
	    int data;
	    Node next;
	    Node(int a){  data = a; next = null; }
	}
	
	public static int getCount(Node head) {
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
	
	Node insertAtBeginning(Node head, int x) {
        Node node = new Node(x);
        node.next = head;
        head = node;
        return head;
    }
    
    Node insertAtEnd(Node head, int x) {
        if(head == null)
            head = insertAtBeginning(head,x);
        else{
            Node node = new Node(x);
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
        return head;
    }
    
    Node insertInMid(Node head, int data) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node node = new Node(data);
        node.next = slow.next;
        slow.next = node;
        return head;
    }
    
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 5);
		head = basic.insertAtEnd(head, 9);
		head = basic.insertAtBeginning(head, 10);
		head = basic.insertAtEnd(head, 17);
		head = basic.insertInMid(head, 51);
		System.out.println("Node Count : "+getCount(head));
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
