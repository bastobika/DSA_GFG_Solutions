package DynamicProgramming;

public class FibonacciNumbersTopDown {

	//Memoization
	public static long findNthFibonacci(int number, long dp[]) {
        if(number == 0)
            return dp[0];
        if(dp[number] == 0)
            dp[number] = findNthFibonacci(number-1,dp) + findNthFibonacci(number-2,dp);
        return dp[number];
    }
	
	public static void main(String[] args) {
		long dp[] = new long[7];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		System.out.println(findNthFibonacci(6,dp));
	}

}
