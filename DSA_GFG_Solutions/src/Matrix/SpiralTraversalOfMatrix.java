package Matrix;

import java.util.ArrayList;

public class SpiralTraversalOfMatrix {

	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        r--;
        c--;
        while(true){
            for(int i=col;i<=c;i++)
                result.add(matrix[row][i]);
            row++;
            if(row > r)
                break;
            for(int i=row;i<=r;i++)
                result.add(matrix[i][c]);
            c--;
            if(col > c)
                break;
            for(int i=c;i>=col;i--)
                result.add(matrix[r][i]);
            r--;
            if(row > r)
                break;
            for(int i=r;i>=row;i--)
                result.add(matrix[i][col]);
            col++;
            if(col > c)
                break;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
		ArrayList<Integer> result = spirallyTraverse(matrix,4,4);
		for(int i=0;i<result.size();i++)
			System.out.print(result.get(i)+" ");
	}

}
