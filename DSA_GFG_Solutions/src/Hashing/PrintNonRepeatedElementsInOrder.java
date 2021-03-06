package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintNonRepeatedElementsInOrder {

	static ArrayList<Integer> printNonRepeated(int arr[], int n){
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Map.Entry entry : map.entrySet()){
            if((int)entry.getValue() == 1)
                result.add((int)entry.getKey());
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] arr = { 2,1,1,3,3,5,4,6};
		System.out.println(printNonRepeated(arr,8));
	}

}
