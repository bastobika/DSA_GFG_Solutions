package Searching;

public class MinimumNumberInASortedRotatedArray {

	static int minNumber(int arr[], int low, int high){
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[high])
                return arr[low];
            if(arr[mid] < arr[low])
                high = mid;
            else if(arr[mid] > arr[high])
                low = mid+1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		System.out.println(minNumber(arr,0,4));
	}

}
