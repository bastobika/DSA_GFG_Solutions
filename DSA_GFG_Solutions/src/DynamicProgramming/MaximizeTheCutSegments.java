package DynamicProgramming;

public class MaximizeTheCutSegments {

	public static int maximizeCuts(int n, int x, int y, int z) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = Integer.MIN_VALUE;
            if(i >= x && dp[i-x] != Integer.MIN_VALUE)
                dp[i] = Math.max(dp[i],1+dp[i-x]);
            if(i >= y && dp[i-y] != Integer.MIN_VALUE)
                dp[i] = Math.max(dp[i],1+dp[i-y]);
            if(i >= z && dp[i-z] != Integer.MIN_VALUE)
                dp[i] = Math.max(dp[i],1+dp[i-z]);
        }
        return dp[n] == Integer.MIN_VALUE ? 0 : dp[n];
    }
	
	public static void main(String[] args) {
		System.out.println(maximizeCuts(5,3,2,1));
	}

}
