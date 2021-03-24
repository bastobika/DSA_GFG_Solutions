package Matrix;

import java.util.ArrayList;

public class SumOfUpperAndLowerTriangles {
	
	static ArrayList<Integer> sumTriangles(int matrix[][], int n)  {
        int upperSum = 0;
        int lowerSum = 0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
                if(j >= i)
                    upperSum += matrix[i][j];
                if(i >= j)
                    lowerSum += matrix[i][j];
            }
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(upperSum);
        result.add(lowerSum);
        return result;
    }
	
	public static void main(String[] args) {
		int A[][] = {{6, 5, 4},
		           {1, 2, 5},
		           {7, 9, 7}};
		ArrayList<Integer> result = sumTriangles(A,3);
		for(int i=0;i<result.size();i++)
				System.out.print(result.get(i) + " ");
	}

}
