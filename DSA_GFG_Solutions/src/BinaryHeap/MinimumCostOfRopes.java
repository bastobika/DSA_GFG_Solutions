package BinaryHeap;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {

	static long minCost(long arr[], int n) {
        long totalSum = 0;
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i=0;i<n;i++)
            pq.add(arr[i]);
        while(pq.size() > 1){
            long a = pq.poll();
            long b = pq.poll();
            totalSum += a+b;
            pq.add(a+b);
        }
        return totalSum;
    }
	
	public static void main(String[] args) {
		long arr[] = {4,3,6,8};
		System.out.println(minCost(arr,4));
	}

}
