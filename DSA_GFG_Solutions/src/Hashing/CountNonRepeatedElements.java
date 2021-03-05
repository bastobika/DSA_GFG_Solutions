package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNonRepeatedElements {
	
	static long countNonRepeated(int arr[], int n)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        int count = 0;
        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue() == 1)
                count++;
        }
        return count;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,5,6,7};
		System.out.println(countNonRepeated(arr,10));
	}
	
}
