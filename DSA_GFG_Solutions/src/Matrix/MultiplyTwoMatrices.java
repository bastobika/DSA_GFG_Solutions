package Matrix;

public class MultiplyTwoMatrices {
	
	static int[][] multiplyMatrix(int A[][], int B[][]) {
        int n1 = A.length; int m1 = (n1 > 0) ? A[0].length : -1;
        int n2 = B.length; int m2 = (n2 > 0) ? B[0].length : -1;
        int[][] result;
        if(m1 != n2)
            result = new int[0][0];
        else{
            result = new int[n1][m2];
            for(int i=0;i<n1;i++)
                for(int j=0;j<m2;j++)
                    for(int k=0;k<m1;k++)
                        result[i][j] += A[i][k] * B[k][j];
        }
        return result;
    }
	
	public static void main(String[] args) {
		int A[][] = {{4, 8},
						{0, 2},
						{1, 6}};
		int B[][] = {{5, 2},
						{9, 4}};
		int result[][] = multiplyMatrix(A,B);
		if(result.length == 0)
			System.out.print(-1);
		else
			for(int i=0;i<result.length;i++)
				for(int j=0;j<result[0].length;j++)
					System.out.print(result[i][j] + " ");
	}

}
