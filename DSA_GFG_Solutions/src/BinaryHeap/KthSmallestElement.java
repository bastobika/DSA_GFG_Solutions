package BinaryHeap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static int kthSmallest(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(pq.size() == k && pq.peek() > arr[i])
                pq.poll();
            if(pq.size() < k)
                pq.add(arr[i]);
        }
        return pq.poll();
    }
	
	public static void main(String[] args) {
		int arr[] = {3,5,4,2,9};
		System.out.println(kthSmallest(arr,5,3));
	}

}
