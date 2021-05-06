package Matrix;

public class MakeMatrixBeautiful {

	static int findMinOperation(int matrix[][], int n){
        int sum = 0;
        int maxSum = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<n;j++)
                sum += matrix[i][j];
            maxSum = Math.max(maxSum,sum);
            arr[i] = sum;
        }
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<n;j++)
                sum += matrix[j][i];
            maxSum = Math.max(maxSum,sum);
        }
        int op = 0;
        for(int i=0;i<n;i++)
            op += maxSum - arr[i];
        return op;
    }
	
	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3},
	              {4, 2, 3},
	              {3, 2, 1}};
		System.out.println(findMinOperation(matrix,3));
	}

}
