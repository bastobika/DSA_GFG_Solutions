package Mathematics;

public class Palindrome {

	private static boolean isPalindrome(int n) {
		int result = 0;
		int x = n;
		while(n > 0) {
			result = result*10 + n%10;
			n = n/10;
		}
		return result == x;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
	}

}
