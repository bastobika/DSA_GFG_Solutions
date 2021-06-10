package DynamicProgramming;

public class CountNumberOfHops {

	static long countWays(int n) {
        long mod = 1000000007;
        if(n == 1 || n == 2)
            return n;
        if(n == 3)
            return 4;
        long curr = 0;
        long prev1 = 4;
        long prev2 = 2;
        long prev3 = 1;
        for(int i=4;i<=n;i++){
            curr = (prev1 + prev2 + prev3)%mod;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
	
	public static void main(String[] args) {
		System.out.println(countWays(8));
	}

}
