package Mathematics;

public class Power {

	private static int power(int n,int p) {
		if(p == 1)
			return n;
		int temp = power(n,p/2);
		if(p %2 == 0)
			return temp*temp;
		return temp*temp*n;
	}
	
	public static void main(String[] args) {
		System.out.println(power(3,4));
		System.out.println(power(3,5));		
	}

}
