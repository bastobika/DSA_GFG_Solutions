package DynamicProgramming;

public class MinimumCostToFillGivenWeightInABag {

	public static int minimumCost(int cost[], int N,int W) {
	    int dp[] = new int[W+1];
	    dp[0] = 0;
	    for(int i=1;i<=W;i++){
	        dp[i] = Integer.MAX_VALUE;
	        for(int j=0;j<N;j++){
	            if(i >= j+1 && cost[j] != -1)
	                dp[i] = dp[i-j-1] == Integer.MAX_VALUE ? dp[i] : Math.min(dp[i],dp[i-j-1]+cost[j]);
	        }
	    }
	    return dp[W] == Integer.MAX_VALUE ? -1 : dp[W];
	}
	
	public static void main(String[] args) {
		int arr[] = {20, 10, 4, 50, 100};
		System.out.println(minimumCost(arr,5,5));
	}

}
