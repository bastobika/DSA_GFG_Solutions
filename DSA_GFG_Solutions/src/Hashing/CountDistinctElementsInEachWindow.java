package Hashing;

import java.util.HashMap;

public class CountDistinctElementsInEachWindow {

	private static void countDistinctElements(int arr[],int k){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<k;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		for(int i=k;i<arr.length;i++) {
			System.out.print(map.size()+" ");
			map.put(arr[i-k], map.get(arr[i-k])-1);
			if(map.get(arr[i-k]) == 0)
				map.remove(arr[i-k]);
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);	
			else
				map.put(arr[i], 1);
		}
		System.out.print(map.size()+" ");
	}
	public static void main(String[] args) {
		int arr[] = {10,10,10,20,50,50,20,10};
		countDistinctElements(arr,3);
 	}

}
