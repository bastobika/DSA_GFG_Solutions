package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueReversal {

	public static Queue<Integer> rev(Queue<Integer> q){
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        while(!q.isEmpty())
            stack.push(q.poll());
        while(!stack.isEmpty())
            q.offer(stack.pop());
        return q;
    }
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(5);
		queue.add(10);
		queue.add(1);
		queue.add(9);
		queue.add(4);
		queue = rev(queue);
		while(!queue.isEmpty())
			System.out.print(queue.poll() + " ");
	}

}
