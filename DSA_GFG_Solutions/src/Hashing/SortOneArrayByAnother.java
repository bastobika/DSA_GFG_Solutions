package Hashing;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SortOneArrayByAnother {

	public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        int[] result = new int[N];
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            if(map.containsKey(A1[i]))
                map.put(A1[i],map.get(A1[i])+1);
            else
                map.put(A1[i],1);
        }
        int index=0;
        for(int i=0;i<M;i++){
            if(map.containsKey(A2[i])){
                for(int j=0;j<map.get(A2[i]);j++){
                    result[index] = A2[i];
                    index++;
                }
                map.remove(A2[i]);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            for(int j=0;j<entry.getValue();j++){
                result[index] = entry.getKey();
                index++;
            }
        }
        return result;    
    }
	
	public static void main(String[] args) {
		int[] a1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
		int[] a2 = {2, 1, 8, 3};
		int[] result = sortA1ByA2(a1,11,a2,4);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}

}
