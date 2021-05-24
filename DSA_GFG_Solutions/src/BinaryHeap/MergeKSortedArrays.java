package BinaryHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

	public class Element implements Comparable<Element> {
        int row;
        int col;
        int value;
        
        Element(int r,int c,int v) {
            this.row = r;
            this.col = c;
            this.value = v;
        }
        
        public int compareTo(Element e) {
            if(e.value > this.value)
                return -1;
            return 1;
        }
        
    }
    
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        PriorityQueue<Element> pq = new PriorityQueue<Element>();
        MergeKSortedArrays object = new MergeKSortedArrays();
        for(int i=0;i<k;i++)
            pq.add(object.new Element(i,0,arr[i][0]));
        while(!pq.isEmpty()){
            Element e = pq.poll();
            result.add(e.value);
            if(e.col < arr[e.row].length-1)
                pq.add(object.new Element(e.row,e.col+1,arr[e.row][e.col+1]));
        }
        return result;
    }
    
	public static void main(String[] args) {
		int arr[][]={{1,2,3,4},
						  {2,2,3,4},
		                  {5,5,6,6},
		                  {7,8,9,9}};
		System.out.println(mergeKArrays(arr,4));
	}

}
