package Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Basics {

	//Function to push element x to the back of the deque.
	public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
	    dq.offerLast(x);
	}

	//Function to pop element from back of the deque.
	public static void pop_back_ppb(ArrayDeque<Integer> dq) {
	    if(dq.peekLast() != null)
	        dq.pollLast();
	}

	//Function to return element from front of the deque.
	public static int front_dq(ArrayDeque<Integer> dq){
	    int element = dq.size() > 0 ? dq.peekFirst() : -1;
	    return element;
	}

	//Function to push element x to the front of the deque.
	public static void push_front_pf(ArrayDeque<Integer> dq, int x){
	    dq.offerFirst(x);
	}
	
	public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
        ArrayDeque<Integer> result = new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
            result.offerLast(arr[i]);
        return result;
    }
	
	//Function to erase the element from specified position X in deque.
	public static void eraseAt(ArrayDeque<Integer> deq , int X) {
	    if(X >= deq.size())
	        return;
	    if(X == 0){
	        deq.pollFirst();
	        return;
	    }else if(X == deq.size()-1){
	        deq.pollLast();
	        return;
	    }else{
	        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	        for(int i=0;i<X;i++)
	            stack.push(deq.pollFirst());
	        deq.pollFirst();
	        while(!stack.isEmpty())
	            deq.offerFirst(stack.pop());
	    }
	}

	//Function to erase the elements in range start (inclusive), end (exclusive).
	public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end) {
	    if(start >= deq.size())
	        return;
	    ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	    for(int i=0;i<start;i++)
	        stack.push(deq.pollFirst());
	    while(start < end){
	        deq.pollFirst();
	        start++;
	    }
	    while(!stack.isEmpty())
	        deq.offerFirst(stack.pop());
	}

	//Function to erase all the elements in the deque.
	public static void eraseAll(ArrayDeque<Integer> deq ) {
	    deq.clear();
	}
	
	//Function to traverse the Deque and print the elements of it.
	public static void printDeque(ArrayDeque<Integer> deq){
	    Iterator<Integer> iter = deq.iterator();
	    while(iter.hasNext())
	        System.out.print(iter.next() + " ");
	    System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		ArrayDeque<Integer> deque = deque_Init(arr,5);
		Basics.push_back_pb(deque, 6);
		Basics.push_front_pf(deque,0);
		System.out.println(Basics.front_dq(deque));
		printDeque(deque);
		Basics.pop_back_ppb(deque);
		Basics.eraseAt(deque,2);
		printDeque(deque);
		Basics.eraseInRange(deque, 1, 3);
		printDeque(deque);
		Basics.eraseAll(deque);
	}

}
