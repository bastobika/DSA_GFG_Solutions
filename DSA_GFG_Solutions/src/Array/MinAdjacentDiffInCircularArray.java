package Array;

public class MinAdjacentDiffInCircularArray {

	public static int minAdjDiff(int arr[], int n) {
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
            minDiff = Math.min(minDiff,Math.abs(arr[i] - arr[i+1]));
        minDiff = Math.min(minDiff,Math.abs(arr[n-1]-arr[0]));
        return minDiff;
    }
	
	public static void main(String[] args) {
		int arr[] = {8,-8,9,-9,10,-11,12};
		System.out.println(minAdjDiff(arr,7));
	}

}
