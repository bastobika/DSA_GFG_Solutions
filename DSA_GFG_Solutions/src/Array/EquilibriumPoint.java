package Array;

public class EquilibriumPoint {

	public static long equilibriumPoint(long arr[], int n) {
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += arr[i];
        int midSum = 0;
        for(int i=0;i<n;i++){
            if(midSum == sum - midSum - arr[i])
                return i+1;
            midSum += arr[i];
        }
        return -1;
    }
	
	public static void main(String[] args) {
		long A[] = {1,3,5,2,2};
		System.out.println(equilibriumPoint(A,5));
	}

}
