package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop() {
	    return q1.isEmpty() ? -1 : q1.poll();
    }
	
    /* The method push to push element into the stack */
    void push(int a) {
	    q2.offer(a);
	    while(!q1.isEmpty())
	        q2.offer(q1.poll());
	    while(!q2.isEmpty())
	        q1.offer(q2.poll());
    }
    
	public static void main(String[] args) {
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(6);
		stack.push(1);
		stack.push(8);
		stack.push(9);
		stack.pop();
		stack.pop();
		while(!stack.q1.isEmpty())
				System.out.print(stack.pop() + " ");
	}

}
