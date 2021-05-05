package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {

	private static int longestSubarrayWithGivenSum(int[] arr,int sum) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int prefixSum = 0;
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			prefixSum += arr[i];
			if(prefixSum == sum)
				result = i+1;
			if(map.containsKey(prefixSum-sum))
				result = Math.max(result, i-map.get(prefixSum-sum));
			else
				map.put(prefixSum, i);
			if(arr[i] == sum)
				result = 1;
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[] = {3,-1,4,1,8,-2,23,-23};
		System.out.println(longestSubarrayWithGivenSum(arr,6));
	}

}
