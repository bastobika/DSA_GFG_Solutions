package BinaryHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestElements {

	class Element implements Comparable<Element> {
		int index;
		int value;
		
		Element(int i,int v) {
			this.index = i;
			this.value = v;
		}
		
		@Override
		public int compareTo(Element e) {
			if(this.value > e.value)
				return 1;
			return -1;
		}
		
	}
	private static ArrayList<Integer> solution(int arr[],int n,int k) {
		KClosestElements object = new KClosestElements();
		PriorityQueue<Element> pq = new PriorityQueue<Element>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			if(pq.size() == k && Math.abs(arr[i]-n) < pq.peek().value)
				pq.poll();
			if(pq.size() < k)
				pq.add(object.new Element(i,Math.abs(arr[i]-n)));
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(!pq.isEmpty())
			result.add(arr[pq.poll().index]);
		return result;			
	}
	
	public static void main(String[] args) {
		int arr1[] = {10,15,7,3,4};
		int arr2[] = {100,80,10,5,70};
		int arr3[] = {20,40,5,100,150};
		System.out.println(solution(arr1,8,2));
		System.out.println(solution(arr2,2,3));
		System.out.println(solution(arr3,100,3));
	}

}
