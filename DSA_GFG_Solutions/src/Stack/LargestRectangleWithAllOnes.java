package Stack;

import Stack.MaximumAreaInAHistogram;

public class LargestRectangleWithAllOnes {

	private static int longestRectangularArea(long matrix[][],long n) {
		int result = 0;
		long arr[] = new long[(int) n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				if(matrix[i][j] == 0)    //Cannot be the base of the histogram as value is 0
					arr[j] = 0;
				else
					arr[j] += matrix[i][j];
			result = Math.max(result,(int)MaximumAreaInAHistogram.getMaxArea(arr,n));
		}
		return result;
	}
	public static void main(String[] args) {
		long[][] matrix = {{0,1,1,0},
									{1,1,1,1},
									{1,1,1,1},
									{1,1,0,0}};
		System.out.print(longestRectangularArea(matrix,4));
	}

}
