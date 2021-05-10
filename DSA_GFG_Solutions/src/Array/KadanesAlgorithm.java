package Array;

public class KadanesAlgorithm {

	static int maxSubarraySum(int arr[], int n){
        int maxSum = arr[0];
        int sum = arr[0];
        for(int i=1;i<n;i++){
            sum = sum+arr[i] >= arr[i] ? sum+arr[i] : arr[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,-2,5};
		System.out.println(maxSubarraySum(arr,5));
	}

}
