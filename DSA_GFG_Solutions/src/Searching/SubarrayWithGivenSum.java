package Searching;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        int begin = 0;
        int end = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            end++;
            while(sum > s)
                sum -= arr[begin++];
            if(sum == s){
                result.add(begin+1);
                result.add(end);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> result = subarraySum(arr,10,15);
		System.out.println(result.get(0) + " " + result.get(1));
	}

}
