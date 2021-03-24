package Matrix;

public class InterchangeRowsOfMatrix {

	static int[][] interchangeRows(int matrix[][])  {
        int n = matrix.length;
        for(int i=0;i<n/2;i++)
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = matrix[i][j] + matrix[n-i-1][j];
                matrix[n-i-1][j] = matrix[i][j] - matrix[n-i-1][j];
                matrix[i][j] = matrix[i][j] - matrix[n-i-1][j];
            }
        return matrix;
    }
	
	public static void main(String[] args) {
		int A[][] = {{6, 5, 4},
		           {1, 2, 5},
		           {7, 9, 7}};
		int[][] result = interchangeRows(A);
		for(int i=0;i<result.length;i++)
			for(int j=0;j<result[0].length;j++)
				System.out.print(result[i][j] + " ");
	}

}
