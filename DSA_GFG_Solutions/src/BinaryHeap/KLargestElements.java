package BinaryHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

	public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            if(pq.size() == k && pq.peek() < arr[i])
                pq.poll();
            if(pq.size() < k)
                pq.add(arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(!pq.isEmpty())
            result.add(pq.poll());
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {3,4,5,2,51,4};
		System.out.println(kLargest(arr,6,3));
	}

}
