package Queue;

public class QueueUsingLinkedList {

	class QueueNode {
		int data;
		QueueNode next;
		QueueNode(int a)
		{
		    data = a;
		    next = null;
		}
	}
	
	QueueNode front, rear;
	
	// This function should add an item at
    // rear
	void push(int a) {
	    if(front == null){
	        rear = new QueueNode(a);
	        front = rear;
	    }else {   
	        rear.next = new QueueNode(a);
	        rear = rear.next;
	    }
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop() {
        int element = front == null ? -1 : front.data;
        if(front != null)
            front = front.next;
        return element;
	}
	
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.push(15);
		queue.push(10);
		queue.pop();
		queue.push(4);
		while(queue.front != null)
			System.out.print(queue.pop() + " ");
	}

}
