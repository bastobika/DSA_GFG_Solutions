package DynamicProgramming;

public class FibonacciNumbersBottomUp {

	//Tabulation
	public static long findNthFibonacci(int number){
        long dp[] = new long[number+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=number;i++)
            dp[i] = dp[i-1]+dp[i-2];
        return dp[number];
    }
	
	//Tabulation - Space Optimized
	public static long findNthFibonacciSpaceOptimized(int number){
        if(number == 0 || number == 1)
            return number;
        long prev_prev = 0;
        long prev = 1;
        long result = 0;
        for(int i=2;i<=number;i++){
            result = prev_prev + prev;
            prev_prev = prev;
            prev = result;
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(findNthFibonacci(6));
	}

}
