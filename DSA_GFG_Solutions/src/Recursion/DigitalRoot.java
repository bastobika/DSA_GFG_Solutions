package Recursion;

public class DigitalRoot {

	public static int digitalRoot(int n){
        if(n/10 == 0)
            return n;
        return digitalRoot(n%10 + digitalRoot(n/10));
    }
	
	public static void main(String[] args) {
		System.out.println(digitalRoot(99999));
	}

}
