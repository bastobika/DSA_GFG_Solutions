package Array;

public class RearrangeArrayWithO1Space {

	static void arrange(long arr[], int n){
        for(int i=0;i<n;i++)
            arr[i] += ((int)arr[(int)arr[i]]%n)*n;
        for(int i=0;i<n;i++)
            arr[i] = arr[i]/n;
        for(int i=0;i<n;i++)
        		System.out.print(arr[i] + " ");
    }
	
	public static void main(String[] args) {
		long arr[] = {4,0,2,1,3};
		arrange(arr,5);
	}

}
