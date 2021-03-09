package Stack;

public class StackUsingLinkedList {

	class StackNode {
	    int data;
	    StackNode next;
	    StackNode(int a)
	    {
	       data = a;
	       next = null;
	    }
	}
    StackNode top;

    void push(int a) {
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;
    }
    int pop() {
        if(top == null)
            return -1;
        int element = top.data;
        top = top.next;
        return element;
    }
    
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(6);
		stack.push(10);
		stack.pop();
		stack.push(11);
		System.out.println("Stack in Reverse :");
		StackNode temp = stack.top;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
