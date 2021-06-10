package DynamicProgramming;

public class SticklerThief {

	public static int FindMaxSum(int arr[], int n) {
        if(n == 1)
            return arr[0];
        int prev2 = 0;
        int prev1 = arr[0];
        int curr = 0;
        for(int i=2;i<=n;i++){
            curr = Math.max(arr[i-1]+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
	
	public static void main(String[] args) {
		int arr[] = {12,56,87,32,6};
		System.out.println(FindMaxSum(arr,5));
	}

}
