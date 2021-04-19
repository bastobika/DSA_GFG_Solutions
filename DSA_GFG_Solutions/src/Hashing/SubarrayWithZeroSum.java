package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubarrayWithZeroSum {

	static boolean findsum(int arr[],int n) {
        Set<Integer> set = new HashSet<Integer>();
        int prefixSum = 0;
        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            if(arr[i] == 0 || prefixSum == 0 || set.contains(prefixSum))
                return true;
            else
                set.add(prefixSum);
        }
        return false;
    }
	
	public static int findSubarray(int[] arr ,int n) {
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    int count = 0;
	    int prefixSum = 0;
	    for(int i=0;i<n;i++){
	        prefixSum += arr[i];
	        if(prefixSum == 0)
	            count++;
	        if(map.containsKey(prefixSum)){
	            count += map.get(prefixSum);
	            map.put(prefixSum,map.get(prefixSum)+1);
	        }else    
	            map.put(prefixSum,1);
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {0,0,5,5,0,0};
		System.out.println(findsum(arr,6));
		System.out.println(findSubarray(arr,6));
	}

}
