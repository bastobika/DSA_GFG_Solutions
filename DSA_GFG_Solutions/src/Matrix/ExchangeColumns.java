package Matrix;

public class ExchangeColumns {

	static int[][] exchangeColumns(int matrix[][]) {
		int col = matrix[0].length;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<col/2;j++){
            matrix[i][j] = matrix[i][j] + matrix[i][col-j-1];
            matrix[i][col-j-1] = matrix[i][j] - matrix[i][col-j-1];
            matrix[i][j] = matrix[i][j] - matrix[i][col-j-1];
        }
        return matrix;
    }
	
	public static void main(String[] args) {
		int A[][] = {{6, 5, 4},
		           {1, 2, 5},
		           {7, 9, 7}};
		int[][] result = exchangeColumns(A);
		for(int i=0;i<result.length;i++)
			for(int j=0;j<result[0].length;j++)
				System.out.print(result[i][j] + " ");
	}

}
