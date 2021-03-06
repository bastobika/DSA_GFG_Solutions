package Hashing;

import java.util.HashSet;
import java.util.Set;

public class HashingForPair {

	public static int sumExists(int arr[], int N, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<N;i++){
            if(set.contains(arr[i]))
                return 1;
            else
                set.add(sum-arr[i]);
        }
        return 0;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumExists(arr,10,14));
	}
	
}
