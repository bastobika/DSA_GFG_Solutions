package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurences {

	
	/* If n is small, you can make HashMap and store frequencies directly. But if n is very large and k is small,
	then it is better to use this way where space required is less. 
	For First Method - O(n) TC and O(n) SC
	For Second Method - O(nk) TC and O(k) SC */
	private static void solution(int arr[],int n,int k) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i])+1);
			else {
				if(map.size() == k) {
					for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
						if(entry.getValue() == 1)
							map.remove(entry.getKey());
						else
							map.put(entry.getKey(),entry.getValue()-1);
					}
				}else
					map.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) 
			if(findOccurence(arr,entry.getKey()) > n/k)
				System.out.print(entry.getKey() + " ");
	}
	
	private static int findOccurence(int[] arr, int key) {
		int count = 0;
		for(int i=0;i<arr.length;i++)
			if(arr[i] == key)
				count++;
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {30,10,20,20,20,10,40,30,30};
		solution(arr,9,4);
	}

}
