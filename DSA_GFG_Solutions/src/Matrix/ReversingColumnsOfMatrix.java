package Matrix;

public class ReversingColumnsOfMatrix {

	static void reverseCol(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++)
            for(int j=0;j<col/2;j++){
                int temp = matrix[i][j] + matrix[i][col-j-1];
                matrix[i][col-j-1] = temp - matrix[i][col-j-1];
                matrix[i][j] = temp - matrix[i][col-j-1];
            }
    }
	
	public static void main(String[] args) {
		int matrix[][] = {{ 1,  2,  3},
	              { 5,  6,  7},
	              {11, 10,  9},
	              {13, 14, 15}};
		reverseCol(matrix);
		System.out.println("Reversing columns");
	}

}
