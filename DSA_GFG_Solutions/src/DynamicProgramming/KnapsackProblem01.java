package DynamicProgramming;

public class KnapsackProblem01 {

	static int knapSack(int W, int wt[], int val[], int n) {
        int dp[][] = new int[W+1][n+1];
        for(int i=0;i<=W;i++)
            dp[i][0] = 0;
        for(int i=0;i<=n;i++)
            dp[0][i] = 0;
        for(int i=1;i<=W;i++){
            for(int j=1;j<=n;j++){
                dp[i][j] = dp[i][j-1];
                if(i >= wt[j-1])
                    dp[i][j] = Math.max(dp[i][j],val[j-1]+dp[i-wt[j-1]][j-1]);
            }
        }
        return dp[W][n];
    } 
	
	public static void main(String[] args) {
		int values[] = {1,2,3};
		int weight[] = {4,5,1};
		
		System.out.println(knapSack(4,weight,values,3));
	}

}
