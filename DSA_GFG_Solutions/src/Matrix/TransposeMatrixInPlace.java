package Matrix;

public class TransposeMatrixInPlace {

	static int[][] transpose(int matrix[][], int n)  {
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i > j){
                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
        return matrix;
    }
	
	public static void main(String[] args) {
		int A[][] = {{6, 5, 4},
		           {1, 2, 5},
		           {7, 9, 7}};
		int[][] result = transpose(A,3);
		for(int i=0;i<result.length;i++)
			for(int j=0;j<result[0].length;j++)
				System.out.print(result[i][j] + " ");
	}
}
