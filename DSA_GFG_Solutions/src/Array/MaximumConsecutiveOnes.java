package Array;

public class MaximumConsecutiveOnes {

	private static int maxConsecutiveOnes(int arr[],int n) {
		int result = 0;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == 1)
				count++;
			else {
				result = Math.max(result, count);
				count = 0;
			}
		}
		result = Math.max(result, count);
		return result;
	}
	
	public static void main(String[] args) {
		int arr1[] = {0,1,1,0,1,0};
		int arr2[] = {1,1,1,1};
		int arr3[] = {0,0,0,0};
		int arr4[] = {1,0,1,1,1,1,0,1,1};
		System.out.println(maxConsecutiveOnes(arr1,6));
		System.out.println(maxConsecutiveOnes(arr2,4));
		System.out.println(maxConsecutiveOnes(arr3,4));
		System.out.println(maxConsecutiveOnes(arr4,9));
	}

}
