package Array;

import java.util.HashMap;

public class CountPairsWithGivenSum {

	static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i]))
                count += map.get(k-arr[i]);
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,1};
		System.out.println(getPairsCount(arr,4,2));
	}

}
