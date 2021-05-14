package Recursion;

public class PowerUsingRecursion {

	static int RecursivePower(int n,int p) {
        if(p == 0)
            return 1;
        return n*RecursivePower(n,p-1);
    }
	
	public static void main(String[] args) {
		System.out.println(RecursivePower(9,9));
	}

}
