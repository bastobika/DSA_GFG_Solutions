package Matrix;

public class RotateMatrixBy90Degree {

	static int[][] rotateby90(int matrix[][], int n)  { 
        //Transpose of Matrix
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i > j){
                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
        //Mirror the Matrix
        for(int i=0;i<n/2;i++)
            for(int j=0;j<n;j++){
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
		int[][] result = rotateby90(A,3);
		for(int i=0;i<result.length;i++)
			for(int j=0;j<result[0].length;j++)
				System.out.print(result[i][j] + " ");
	}

}
