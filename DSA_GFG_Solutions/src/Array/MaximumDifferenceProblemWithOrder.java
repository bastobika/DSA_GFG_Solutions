package Array;

public class MaximumDifferenceProblemWithOrder {

	private static int maxDiff(int arr[],int n) {
		int minElem = 0;
		int maxDiff = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] > arr[minElem])
				maxDiff = Math.max(maxDiff, arr[i]-arr[minElem]);
			minElem = arr[minElem] > arr[i] ? i : minElem;
		}
		return maxDiff;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,4,8,1};
		System.out.println(maxDiff(arr,7));
	}

}
