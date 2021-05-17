package Mathematics;

public class AllDivisors {

	private static void printDivisors(int n) {
		for(int i=1;i*i <= n;i++) 
			if(n%i == 0) 
				System.out.print(i  + " ");
				
		for(int i=(int)Math.floor(Math.sqrt(n))-1;i>=1;i--)		
			if(n%i == 0)
				System.out.print(n/i + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		printDivisors(100);
	}

}
