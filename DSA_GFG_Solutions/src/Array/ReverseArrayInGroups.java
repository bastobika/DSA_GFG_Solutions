package Array;

import java.util.ArrayList;

public class ReverseArrayInGroups {

	static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int i=0;
        int temp = 0;
        while(i < n){
            temp = i+k-1 < n ? i+k-1 : n-1;
            reverse(arr,i,temp);
            i += k;
        }
        for(i=0;i<n;i++)
        	System.out.print(arr.get(i) + " ");
    }
    
    private static void reverse(ArrayList<Integer> arr,int begin,int end){
        while(begin < end){
            arr.set(begin,arr.get(begin) + arr.get(end));
            arr.set(end,arr.get(begin) - arr.get(end));
            arr.set(begin,arr.get(begin) - arr.get(end));
            begin++;
            end--;
        }
    }
    
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		reverseInGroups(arr,5,3);
	}

}
