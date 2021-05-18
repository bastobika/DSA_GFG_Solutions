package Array;

public class MoveZerosToEnd {

	private static void moveZerosToEnd(int arr[],int n) {
		int size = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) 
				arr[size++] = arr[i];
		}
		for(int i=size;i<n;i++)
			arr[i] = 0;
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[] = {8,10,0,20,0,5};
		int arr2[] = {0,0,0,10,0};
		int arr3[] = {10,20};
		moveZerosToEnd(arr1,6);
		moveZerosToEnd(arr2,5);
		moveZerosToEnd(arr3,2);
	}

}
