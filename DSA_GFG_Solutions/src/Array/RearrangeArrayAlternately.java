package Array;

public class RearrangeArrayAlternately {

	public static void rearrange(int arr[], int n){
        int max = arr[n-1]+1;
        int low = 0;
        int high = n-1;
        int i = 0;
        while(i < n){
            arr[i] += (arr[high]%max)*max;
            arr[high] -= arr[high]%max;
            if(i+1 < n){
                arr[i+1] += (arr[low]%max)*max;
                arr[low] -= arr[low]%max;
            }
            high--;
            low++;
            i += 2;
        }
        for(i=0;i<n;i++)
            arr[i] = arr[i]/max;
        for(i=0;i<n;i++)
        	System.out.print(arr[i] + " ");
    }
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		rearrange(arr,6);
	}

}
