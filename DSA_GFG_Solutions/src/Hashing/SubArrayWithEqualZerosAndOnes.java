package Hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithEqualZerosAndOnes {

	static int countSubarrWithEqualZeroAndOne(int arr[], int N) {
        for(int i=0;i<N;i++)
            if(arr[i] == 0)
                arr[i] = -1;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        int prefixSum = 0;
        for(int i=0;i<N;i++){
            prefixSum += arr[i];
            if(prefixSum == 0)
                count++;
            if(map.containsKey(prefixSum)){
                count += map.get(prefixSum);
                map.put(prefixSum,map.get(prefixSum)+1);
            }
            else
                map.put(prefixSum,1);
        }
        return count;
    }
	
	public static void main(String[] args) {
		int A[] = {1,0,0,1,0,1,1};
		System.out.println(countSubarrWithEqualZeroAndOne(A,7));
	}

}
