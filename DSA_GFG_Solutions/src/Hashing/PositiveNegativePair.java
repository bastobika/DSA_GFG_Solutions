package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PositiveNegativePair {

	public static ArrayList<Integer> findPairs(int arr[], int n) { 
    	Set<Integer> set = new HashSet<Integer>();
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	for(int i=0;i<n;i++){
    	    if(set.contains(-arr[i])){
    	        result.add(-Math.abs(arr[i]));
    	        result.add(Math.abs(arr[i]));
    	    }
    	    else
    	        set.add(arr[i]);
    	}
    	return result;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,3,6,-2,-1,-3,2,7};
		ArrayList<Integer> result = findPairs(arr,8);
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
	}
}
