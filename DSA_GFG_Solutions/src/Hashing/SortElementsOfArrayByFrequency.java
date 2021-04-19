package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortElementsOfArrayByFrequency {

static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    static class sortByFrequency implements Comparator<Integer> {
        public int compare(Integer a,Integer b){
            if(map.get(a) > map.get(b) || (map.get(a) == map.get(b) && a < b))    
                return -1;
            return 1;
        }
    }
    static ArrayList<Integer> sortByFreq(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            result.add(arr[i]);
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i]) + 1);
            else
                map.put(arr[i],1);
        }
        Collections.sort(result,new sortByFrequency());
        map.clear();
        return result;
    }
    
	public static void main(String[] args) {
		int[] arr = {5,5,4,6,4};
		System.out.println(sortByFreq(arr,5));
	}

}
