package Matrix;

public class AddTwoMatrices {

	static int[][] sumMatrix (int A[][], int B[][]) {
        int n1 = A.length; int m1 = (n1 > 0) ? A[0].length : -1;
        int n2 = B.length; int m2 = (n2 > 0) ? B[0].length : -1;
        int[][] result = new int[0][0];
        if(n1 != n2 || m1 != m2)
            return result;
        for(int i=0;i<n1;i++)
            for(int j=0;j<m1;j++)
                A[i][j] = A[i][j] + B[i][j];
        return A;
    }
	
	public static void main(String[] args) {
		int A[][] = {{1, 2, 3},
				       	  {4, 5, 6}};
		int B[][] = {{1, 3, 3},
				         {2, 3, 3}};
		int result[][] = sumMatrix(A,B);
		if(result.length == 0)
			System.out.print(-1);
		else
			for(int i=0;i<result.length;i++)
				for(int j=0;j<result[0].length;j++)
					System.out.print(result[i][j] + " ");
	}
}
