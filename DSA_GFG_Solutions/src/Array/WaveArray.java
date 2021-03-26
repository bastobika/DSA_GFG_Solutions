package Array;

public class WaveArray {

	public static int[] convertToWave(int arr[], int n){
        for(int i=1;i<n;i=i+2){
            arr[i] = arr[i] + arr[i-1];
            arr[i-1] = arr[i] - arr[i-1];
            arr[i] = arr[i] - arr[i-1];
        }
        return arr;
    }
	
	public static void main(String[] args) {
		int[] arr = {2,4,7,8,9,10};
		arr = convertToWave(arr,6);
		for(int i=0;i<6;i++)
			System.out.print(arr[i] + " ");
	}

}
