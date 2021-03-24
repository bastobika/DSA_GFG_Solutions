package Searching;

public class SearchInSortedArray {

	static int searchInSorted(int arr[], int N, int K) {
        int low = 0;
        int high = N-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] == K)
                return 1;
            else if(arr[mid] > K)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		System.out.println(searchInSorted(arr,5,6));
	}

}
