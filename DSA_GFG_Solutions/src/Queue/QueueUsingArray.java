package Queue;

public class QueueUsingArray {

	int front, rear;
	int arr[] = new int[100005];

	QueueUsingArray() {
		front=-1;
		rear=-1;
	}
	
	/* The method push to push element
	   into the queue */
	void push(int x) {
	    if(front == -1)
	        front++;
	    arr[++rear] = x;
	} 

    /* The method pop which return the 
       element poped out of the queue*/
	int pop() {
		return (front == -1 || front == rear+1) ? -1 : arr[front++];
	} 
	
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray();
		queue.push(5);
		queue.push(18);
		queue.push(9);
		queue.pop();
		queue.push(8);
		while(queue.front != queue.rear + 1)
			System.out.print(queue.pop() + " ");
	}
}
