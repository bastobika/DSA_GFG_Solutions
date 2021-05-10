package Array;

public class RotateArray {

	static void rotateArr(int arr[], int d, int n){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++)
        	System.out.print(arr[i] + " ");
    }
    
    private static void reverse(int arr[],int begin,int end){
        while(begin < end){
            arr[begin] = arr[begin] + arr[end];
            arr[end] = arr[begin] - arr[end];
            arr[begin] = arr[begin] - arr[end];
            begin++;
            end--;
        }
    }
    
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		rotateArr(arr,2,5);
	}

}
