package BinaryHeap;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static int KthLargest(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            if(pq.size() == k && pq.peek() < arr[i])
                pq.poll();
            if(pq.size() < k)
                pq.add(arr[i]);
        }
        return pq.poll();
    }
	
	public static void main(String[] args) {
		int arr[] = {4,5,29,1,3};
		System.out.println(KthLargest(arr,5,3));
	}

}
