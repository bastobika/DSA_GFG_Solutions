package Mathematics;

public class PrimeFactors {

	private static void  primeFactors(int n) {
		int i=2;
		while(i < Math.sqrt(n)) {
			if(n%i == 0) {
				System.out.print(i + " ");
				n = n/i;
			}else
				i++;
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		primeFactors(12);
		primeFactors(13);
		primeFactors(315);
		primeFactors(84);
	}

}
