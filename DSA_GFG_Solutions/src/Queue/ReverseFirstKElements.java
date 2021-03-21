package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseFirstKElements {

	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)  {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=1;i<=k;i++)
            stack.push(q.poll());
        while(!stack.isEmpty())
            q.offer(stack.pop());
        for(int i=1;i<=q.size()-k;i++)
            q.offer(q.poll());
        return q;
    }
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
		queue.offer(7);
		queue.offer(8);
		queue = modifyQueue(queue,3);
		while(!queue.isEmpty())
			System.out.print(queue.poll() + " ");
	}

}
