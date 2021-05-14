package Recursion;

public class PalindromeUsingRecursion {

	private static boolean isPalindrome(String str) {
		int len = str.length();
		if(len <= 1)
			return true;
		return str.charAt(0) == str.charAt(len-1) && isPalindrome(str.substring(1,len-1));
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("abcba"));
	}

}
