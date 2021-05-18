package Array;

public class MinimumConsecutiveFlips {

	//Two traversals
	private static void minFlips(int arr[],int n) {
		int oneGroups = 0;
		int zeroGroups = 0;
		for(int i=1;i<n;i++) {
			if(arr[i] != arr[i-1]) {
				if(arr[i-1] == 1)
					oneGroups++;
				else
					zeroGroups++;
			}
		}
		if(arr[n-1] == 1)
			oneGroups++;
		else
			zeroGroups++;
		int x = 0;
		if(oneGroups == 0 || zeroGroups == 0)
			return;
		else
			x = oneGroups >= zeroGroups ? 0 : 1;
		boolean begin = false;
		for(int i=0;i<n;i++) {
			if(arr[i] == x) {
				if(!begin) {
					System.out.print("From " + i);
					begin = true;
				}else {
					if(i+1 < n && arr[i+1] != x) {
						System.out.println(" to "+i);
						begin = false;
					}
				}
			}else
				if(begin)
					System.out.println(" to "+(i-1));
		}
	}
	
	
	//One traversal
	private static void minFlipsOneTraversal(int arr[],int n) {
		boolean begin = false;
		for(int i=1;i<n;i++) {
			if(arr[i] != arr[0]) {
				if(!begin) {
					System.out.print("From " + i);
					begin = true;
				}else if(i+1 < n && arr[i] != arr[i+1]) {
					System.out.println(" to "+i);
					begin = false;
				}
			}	
		}
		if(begin)
			System.out.println(" to "+(n-1));
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,1,0,0,0,1};
		int[] arr2 = {1,0,0,0,1,0,0,1,1,1,1};
		int[] arr3 = {1,1,1};
		int[] arr4 = {0,1};
		minFlipsOneTraversal(arr1,6);
		System.out.println("------------------");
		minFlipsOneTraversal(arr2,11);
		System.out.println("------------------");
		minFlipsOneTraversal(arr3,3);
		System.out.println("------------------");
		minFlipsOneTraversal(arr4,2);
	}
	
}
