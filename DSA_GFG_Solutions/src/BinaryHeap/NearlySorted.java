package BinaryHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySorted {

	static ArrayList <Integer> nearlySorted(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
            pq.add(arr[i]);
        for(int i=k;i<n;i++){
            pq.add(arr[i]);
            result.add(pq.poll());
        }
        while(!pq.isEmpty())
            result.add(pq.poll());
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {6,5,3,2,8,10,9};
		System.out.println(nearlySorted(arr,7,3));
	}

}
