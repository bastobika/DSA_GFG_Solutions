package Matrix;

public class MedianInARowwiseSortedMatrix {

	private static int median(int matrix[][]) {
		int row = matrix.length;
		int col = matrix[0].length;
		int elemBeforeMedian = (row*col)/2;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<row;i++) {
			min = Math.min(min,matrix[i][0]);
			max = Math.max(max,matrix[i][col-1]);
		}
		int result = 0;
		while(min < max) {
			int mid = (min+max)/2;
			int elemBeforeMid = findElem(matrix,mid);
			if(elemBeforeMid > elemBeforeMedian)
				max = mid-1;
			else {
				if(elemBeforeMid == elemBeforeMedian)
					result = mid;
				min = mid;
			}
		}
		return result;
	}
	
	private static int findElem(int[][] matrix, int mid) {
		int count = 0;
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++)
				if(matrix[i][j] < mid)
					count++;
				else
					break;
		return count;
	}

	public static void main(String[] args) {
		int matrix[][] = {{5,10,20,30,40},
								  {1,2,3,4,6},
								  {11,13,15,17,19}};
		System.out.println(median(matrix));
	}

}
