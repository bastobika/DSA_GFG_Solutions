package Array;

import java.util.Arrays;

public class MeanAndMedianOfArray {

	//Function to find median of the array elements.  
    public static int median(int A[],int N) {
        Arrays.sort(A);
        if(N%2 ==0)
            return (A[N/2 -1] + A[N/2])/2;
        return A[N/2];
    }
    //Function to find median of the array elements.
    public static int mean(int A[],int N) {
        int sum = 0;
        for(int i=0;i<N;i++)
            sum += A[i];
        return sum/N;
    }
    
	public static void main(String[] args) {
		int[] arr = {1, 2, 19, 28, 5};
		System.out.println("Mean = "+mean(arr,5)+" Median = "+median(arr,5));
	}

}
