package Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithZeroSum {

	static boolean findsum(int arr[],int n) {
        Set<Integer> set = new HashSet<Integer>();
        int prefixSum = 0;
        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            if(arr[i] == 0 || prefixSum == 0 || set.contains(prefixSum))
                return true;
            else
                set.add(prefixSum);
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[] arr = {4,2,1,-3,6};
		System.out.println(findsum(arr,5));
	}

}
