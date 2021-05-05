package Hashing;

import java.util.HashSet;

public class CountDistinctElements {

	private static int countDistinctElements(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
			set.add(arr[i]);
		return set.size();
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,2,5,5,2,4};
		System.out.println(countDistinctElements(arr));
	}

}
