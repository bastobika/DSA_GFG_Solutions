package Mathematics;

public class TrailingZerosInFactorial {

	
	//O(n) 
	private static int trailingZeros(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			int temp = i;
			while(temp%10 == 0) {
				count++;
				temp = temp/10;
			}
			while(temp%10 == 5) {
				count++;
				temp = temp/5;
			}
		}
		return count;
	}
	
	//O(logn)
	private static int trailingZerosEfficient(int n) {
		int count = 0;
		for(int i=5;i<=n;i=i*5) 
			count += n/i;
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(trailingZeros(5));
		System.out.println(trailingZerosEfficient(10));
		System.out.println(trailingZerosEfficient(100));
	}

}
