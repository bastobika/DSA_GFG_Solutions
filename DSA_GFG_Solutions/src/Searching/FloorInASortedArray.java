package Searching;

public class FloorInASortedArray {

	static int findFloor(long arr[], int n, long x) {
        if(x < arr[0])
            return -1;
        int low = 0;
        int high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                high = mid-1;
            else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		long arr[] = {1,2,8,10,11,12,19};
		System.out.println(findFloor(arr,7,5));
	}

}
