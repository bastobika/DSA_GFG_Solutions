package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

	public static int firstRepeated(int []arr, int n) {
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    int index = (int)Double.POSITIVE_INFINITY;
	    for(int i=0;i<n;i++){
	        if(!map.containsKey(arr[i]))
	            map.put(arr[i],i);
	        else
	            index = Math.min(index,map.get(arr[i]));
	    }
	    return (index==(int)Double.POSITIVE_INFINITY) ?-1:index+1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,3,4,3,5,6};
		System.out.println(firstRepeated(arr,7));

	}

}
