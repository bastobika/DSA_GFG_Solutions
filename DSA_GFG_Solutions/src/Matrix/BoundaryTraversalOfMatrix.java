package Matrix;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {

	static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int row = 0;
        int col = m-1;
        for(int i=0;i<=col;i++)
            result.add(matrix[row][i]);
        row++;
        for(int i=row;i<n;i++)
            result.add(matrix[i][col]);
        col--;
        if(row < n)
            for(int i=col;i>=0;i--)
                result.add(matrix[n-1][i]);
        if(col >= 0)
            for(int i=n-2;i>=row;i--)
                result.add(matrix[i][0]);
        return result;
    }
	
	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3, 4},
		         {5, 6, 7, 8},
		         {9, 10, 11, 12},
		         {13, 14, 15,16}};
		ArrayList<Integer> result = boundaryTraversal(matrix,4,4);
		for(int i=0;i<result.size();i++)
			System.out.print(result.get(i)+" ");
	}

}
