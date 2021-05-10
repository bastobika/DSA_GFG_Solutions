package Array;

import java.util.ArrayList;

public class LeadersInAnArray {

	static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int max = arr[n-1];
        result.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= max){
                max = Math.max(max,arr[i]);
                result.add(max);
            }
        }
        for(int i=0;i<result.size()/2;i++){
            result.set(i,result.get(i) + result.get(result.size()-i-1));
            result.set(result.size()-i-1,result.get(i) - result.get(result.size()-i-1));
            result.set(i,result.get(i) - result.get(result.size()-i-1));
        }
        return result;
    }
	
	public static void main(String[] args) {
		int A[] = {16,17,4,3,5,2};
		ArrayList<Integer> result = leaders(A,6);
		for(int i=0;i<result.size();i++)
			System.out.print(result.get(i)+" ");
	}

}
