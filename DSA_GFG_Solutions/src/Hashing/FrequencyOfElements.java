package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

	private static HashMap<Integer,Integer> frequency(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		return map;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,2,5,5,2,4};
		HashMap<Integer,Integer> map = frequency(arr);
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
