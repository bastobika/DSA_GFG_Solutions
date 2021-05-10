package Array;

public class CheckIfArraySortedAndRotated {

	public static boolean checkRotatedAndSorted(int arr[], int n){
        if(n == 1)
            return false;
        boolean increasing = arr[0] > arr[n-1] ? true : false;
        boolean result = false;
        for(int i=0;i<n-1;i++){
            if(arr[i+1] < arr[i] && increasing){
                if(!result)
                    result = true;
                else
                    return false;
            }
            else if(arr[i+1] > arr[i] && !increasing){
                if(!result)
                    result = true;
                else
                    return false;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {3,4,1,2};
		System.out.println(checkRotatedAndSorted(arr,4));
	}

}
