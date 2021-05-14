package Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class RotateDequeByK {

	//Function to rotate deque by k places in anti-clockwise direction.
	public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {
	    for(int i=0;i<k%n;i++)
	        deque.offerLast(deque.pollFirst());
	}

	//Function to rotate deque by k places in clockwise direction.
	public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {
	    for(int i=0;i<k%n;i++)
	        deque.offerFirst(deque.pollLast());
	}
	
	//Function to traverse the Deque and print the elements of it.
	public static void printDeque(ArrayDeque<Integer> deq){
	    Iterator<Integer> iter = deq.iterator();
	    while(iter.hasNext())
	        System.out.print(iter.next() + " ");
	    System.out.println();
	}
		
	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		left_Rotate_Deq_ByK(deque,5,2);
		printDeque(deque);
		right_Rotate_Deq_ByK(deque,5,4);
		printDeque(deque);
	}

}
