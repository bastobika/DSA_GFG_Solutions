package BinaryHeap;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {

	public static void kthLargest(int arr[], int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            if(pq.size() == k && pq.peek() < arr[i])
                pq.poll();
            if(pq.size() < k)
                pq.add(arr[i]);
            if(pq.size() == k)
                System.out.print(pq.peek() + " ");
            else
                System.out.print(-1 + " ");
        }
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		kthLargest(arr,6,3);
	}

}
