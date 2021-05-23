package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubarrayWithSameSum {

	private static int longestCommonSubarray(int arr1[],int arr2[]) {
		int temp[] = new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
			temp[i] = arr1[i] - arr2[i];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int result = 0;
		int sum = 0;
		for(int i=0;i<temp.length;i++) {
			sum += temp[i];
			if(sum == 0)
				result = i+1;
			if(map.containsKey(sum))
				result = Math.max(result,i-map.get(sum));
			else
				map.put(sum,i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr1[] = {0,1,0,1,1,1,1};
		int arr2[] = {1,1,1,1,1,0,1};
		System.out.println(longestCommonSubarray(arr1,arr2));
	}

}
