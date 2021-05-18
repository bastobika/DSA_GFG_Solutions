package Searching;

public class SmallestPositiveMissingNumber {

	static int missingNumber(int arr[], int size){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i] = arr[i] < 0 || arr[i] > size ? 0 : arr[i];
            max = Math.max(max,arr[i]);
        }
        if(max == 0)
            return 1;
        for(int i=0;i<size;i++){
            int index = arr[i]%(max+1);
            if(index > 0){
                arr[index-1] += max+1;
                arr[i] -= index;
            }
        }
        for(int i=0;i<size;i++)
            if(arr[i] < max+1)
                return i+1;
        return max+1;
    }
	
	public static void main(String[] args) {
		int arr[] = {0,-10,3,1,-20};
		System.out.println(missingNumber(arr,5));
	}

}
