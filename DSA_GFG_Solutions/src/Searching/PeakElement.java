package Searching;

public class PeakElement {

	public static int peakElement(int[] arr,int n){
	    if(n == 1)
	        return 0;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
                return mid;
            if(mid > 0 && arr[mid] < arr[mid-1])
                high = mid-1;
            else if(mid < n-1 && arr[mid] < arr[mid+1])
                low = mid+1;
       }
       return -1;
    }
	
	public static void main(String[] args) {
		int arr[] = {3,6,9,15,10};
		System.out.println(peakElement(arr,5));
	}

}
