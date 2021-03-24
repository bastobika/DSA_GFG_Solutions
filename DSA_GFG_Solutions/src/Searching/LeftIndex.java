package Searching;

public class LeftIndex {

	static int leftIndex(int N, int arr[], int X) {
	       int low = 0; int high = N-1; int mid = 0;
	       while(low <= high){
	            mid = (low+high)/2;
	            if(arr[mid] > X)
	                high = mid-1;
	            else if(arr[mid] < X)
	                low = mid+1;
	            else
	                if(mid == 0 || arr[mid-1] != X)
	                    return mid;
	                else
	                    high = mid-1;
	       }
	       return -1;
	    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,5,5,6,7};
		System.out.println(leftIndex(10,arr,1));
	}
}
