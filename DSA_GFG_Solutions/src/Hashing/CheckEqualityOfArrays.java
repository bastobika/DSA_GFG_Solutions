package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckEqualityOfArrays {

	public static boolean check(long arr[],long brr[],int n) {
	    Map<Long,Integer> map = new HashMap<Long,Integer>();
	    for(int i=0;i<n;i++){
	        if(map.containsKey(arr[i]))
	            map.put(arr[i],map.get(arr[i])+1);
	        else
	            map.put(arr[i],1);
	    }
	    for(int i=0;i<n;i++){
	        if(map.containsKey(brr[i])){
	            map.put(brr[i],map.get(brr[i])-1);
	            if(map.get(brr[i]) == 0)
	                map.remove(brr[i]);
	        }else
	            return false;
	    }
	    if(map.size() > 0)
	        return false;
	    return true;
	}
	
	public static void main(String[] args) {
		long[] arr = {4,5,7,8,7};
		long[] brr = {5,4,8,7,7};
		System.out.println(check(arr,brr,5));
	}

}
