package Recursion;

public class LuckyNumbers {

	public static boolean isLucky(int n) {
        int x = 2;
        return lucky(n,x);
    }
    
    private static boolean lucky(int n,int x) {
        if(n%x == 0)
            return false;
        else if(n < x)
            return true;
        return lucky(n-n/x,x+1);
    }
    
	public static void main(String[] args) {
		System.out.println(isLucky(19));
		System.out.println(isLucky(5));
	}

}
