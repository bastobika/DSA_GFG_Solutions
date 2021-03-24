package Matrix;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {

	static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            if(i%2 == 0)
                for(int j=0;j<matrix.length;j++)
                    result.add(matrix[i][j]);
            else
                for(int j=matrix.length-1;j>=0;j--)
                    result.add(matrix[i][j]);
        }
        return result;
    }
	
	public static void main(String[] args) {
		int A[][] = {{6, 5, 4},
		           {1, 2, 5},
		           {7, 9, 7}};
		ArrayList<Integer> result = snakePattern(A);
		for(int i=0;i<result.size();i++)
				System.out.print(result.get(i) + " ");
	}
}
