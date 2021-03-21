package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void Push(int x) {
	    s1.push(x);
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop() {
	    // Your code here
	    while(!s1.empty())
	        s2.push(s1.pop());
	    int element = s2.empty() ? -1 : s2.pop();
	    while(!s2.empty())
	        s1.push(s2.pop());
	    return element;     
    }
    
	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.Push(5);
		queue.Push(10);
		queue.Pop();
		queue.Push(4);
		queue.Push(9);
		while(!queue.s1.isEmpty())
			System.out.print(queue.Pop() + " ");
	}

}
