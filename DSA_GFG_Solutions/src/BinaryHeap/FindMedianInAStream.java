package BinaryHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianInAStream {

	static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    
    //Function to insert heap.
    public static void insertHeap(int x) {
        if(minHeap.size() == maxHeap.size())
            maxHeap.add(x);
        else
            minHeap.add(x);
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps() {
       if(!minHeap.isEmpty() && minHeap.peek() < maxHeap.peek()){
           int element = maxHeap.poll();
           maxHeap.add(minHeap.poll());
           minHeap.add(element);
       }
    }
    
    //Function to return Median.
    public static double getMedian() {
        if(minHeap.size() == maxHeap.size())
            return (double)(minHeap.peek() + maxHeap.peek())/2;
        return maxHeap.peek();
    }
    
	public static void main(String[] args) {
		int arr[] = {5,15,1,3,7,9,11};
		for(int i=0;i<arr.length;i++) {
			insertHeap(arr[i]);
			System.out.print(getMedian() + " ");
		}
	}

}
