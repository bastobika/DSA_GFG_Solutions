package Searching;

public class CountOnesInBinaryArray {

	public static int countOnes(int arr[], int N) {
        int low = 0; int high = N-1;
        if(arr[high] == 1)
            return N;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == 1){
                if(arr[mid+1] == 0)
                    return mid+1;
                else
                   low = mid+1; 
            }
            else
                high = mid-1;
        }
        return 0;
    }
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,0,0,0};
		System.out.println(countOnes(arr,8));
	}

}
