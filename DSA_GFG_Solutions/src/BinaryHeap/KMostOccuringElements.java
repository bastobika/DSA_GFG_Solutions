package BinaryHeap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostOccuringElements {

	class Element implements Comparable<Element>{
        int element;
        int frequency;
        
        Element(int e,int f) {
            this.element = e;
            this.frequency = f;
        }
        
        @Override
        public int compareTo(Element e) {
            if(this.frequency > e.frequency)
                return 1;
            return -1;
        }
        
    }
	
    //Function to print the sum of frequencies of k numbers
    //with most occurrences in an array.
    static int kMostFrequent(int arr[], int n, int k){
        PriorityQueue<Element> pq = new PriorityQueue<Element>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        KMostOccuringElements object = new KMostOccuringElements();
        for(int i=0;i<n;i++)
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(pq.size() == k && pq.peek().frequency < entry.getValue())
                pq.poll();
            if(pq.size() < k) pq.add(object.new Element(entry.getKey(),entry.getValue()));
        }
        int sum = 0;
        while(!pq.isEmpty())
            sum += pq.poll().frequency;
        return sum;
    }
    
	public static void main(String[] args) {
		int arr[] = {1,2,1,4,4,3,5,6};
		System.out.println("Sum of frequencies of k most occuring elements is " + kMostFrequent(arr,8,2));
	}

}
