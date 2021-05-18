package Array;

public class RemoveDuplicatesFromSortedArray {

	private static void removeDuplicates(int arr[],int n) {
		int size = 0;
		int i = 1;
		while(i < n) {
			if(arr[i] != arr[i-1])
				arr[++size] = arr[i];
			i++;
		}
		for(i=0;i<=size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[] = {10,20,20,30,30,30,40};
		int arr2[] = {10,10,10};
		removeDuplicates(arr1,7);
		removeDuplicates(arr2,3);
	}

}
