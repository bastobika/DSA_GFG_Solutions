package BinaryHeap;

import java.util.PriorityQueue;

public class PurchasingMaximumItems {

	private static int count(int arr[],int sum) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int count = 0;
		for(int i=0;i<arr.length;i++)   //You can also use build heap function to do this in O(n) time instead of O(nlogn)
			pq.add(arr[i]);
		while(sum > 0) {
			sum -= pq.poll();
			if(sum >= 0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {20,10,5,30,100};
		System.out.println(count(arr,35));

	}

}
