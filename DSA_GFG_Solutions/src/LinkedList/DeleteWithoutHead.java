package LinkedList;

import LinkedList.BasicOperations.Node;

public class DeleteWithoutHead {

	static void deleteNode(Node node) {
         node.data = node.next.data;
         node.next = node.next.next;
    }
	
}
