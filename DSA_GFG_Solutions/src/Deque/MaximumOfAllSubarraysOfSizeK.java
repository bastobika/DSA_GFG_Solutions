package Deque;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MaximumOfAllSubarraysOfSizeK {

	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
        int max = arr[0];
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i])
                deque.pollLast();
            deque.offerLast(i);
        }
        for(int i=k;i<n;i++){
            result.add(arr[deque.peekFirst()]);
            while(!deque.isEmpty() && deque.peekFirst() <= i-k)
                deque.pollFirst();
            while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i])
                deque.pollLast();
            deque.offerLast(i);
        }
        result.add(arr[deque.peekFirst()]);
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,4,5,2,3,6};
		ArrayList<Integer> result = max_of_subarrays(arr,9,3);
		for(int i=0;i<result.size();i++)
			System.out.print(result.get(i) + " ");
	}

}
