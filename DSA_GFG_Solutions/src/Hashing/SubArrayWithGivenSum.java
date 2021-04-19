package Hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

	static int subArraySum(int arr[], int n, int sum) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int prefixSum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            if(prefixSum == sum)
                count++;
            if(map.containsKey(prefixSum-sum))
                count += map.get(prefixSum-sum);
            if(map.containsKey(prefixSum))
                map.put(prefixSum,map.get(prefixSum)+1);
            else
                map.put(prefixSum,1);
        }
        return count;
    }
	public static void main(String[] args) {
		int arr[] = {10,2,-2,-20,10};
		System.out.println(subArraySum(arr,5,-10));
	}

}
