package Array;

public class LongestSubarrayOfEvensAndOdds {

	public static int maxEvenOdd(int arr[], int n) {
        int maxLength = 0;
        int length = 1;
        for(int i=0;i<n-1;i++){
            if((arr[i] + arr[i+1])%2 != 0)
                length++;
            else{
                maxLength = Math.max(length,maxLength);
                length = 1;
            }
        }
        maxLength = Math.max(length,maxLength);
        return maxLength;
    }
	
	public static void main(String[] args) {
		int a[] = {10,12,14,7,8};
		System.out.println(maxEvenOdd(a,5));
	}

}
