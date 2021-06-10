package DynamicProgramming;

public class CountWaysToReachNthStair {

	//Order matters - 1-2-1, 1-1-2 and 2-1-1 are considered different ways
	static int countWaysOrdered(int n) {
        int mod = 1000000007;
        int curr = 1;
        int prev = curr;
        int prev_prev = 1;
        for(int i=2;i<=n;i++){
            prev_prev = prev%mod;
            prev = curr%mod;
            curr = (prev + prev_prev)%mod;
        }
        return curr%mod;
    }
	
	public static void main(String[] args) {
		System.out.println(countWaysOrdered(4));
	}

}
