package LinkedList;

import LinkedList.BasicOperations.Node;

public class CheckIfListIsPalindrome {

	public static int getCount(Node head) {
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    
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
    
    static boolean isPalindrome(Node head) {
        int length = getCount(head);
        length = length % 2 == 0 ? length/2 - 1 : length/2;
        Node traverse = head;
        for(int i=0;i<length;i++)
            traverse = traverse.next;
        traverse.next = reverseList(traverse.next);
        Node begin = head; traverse = traverse.next;
        
        while(traverse != null){
            if (begin.data != traverse.data)
                return false;
            begin = begin.next;
            traverse = traverse.next;
        }
        return true;
    }
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Node head = basic.insertAtBeginning(null, 1);
		head = basic.insertAtEnd(head, 2);
		head = basic.insertAtEnd(head, 3);
		head = basic.insertAtEnd(head, 2);
		head = basic.insertAtEnd(head, 1);
		System.out.println(isPalindrome(head));
	}

}
