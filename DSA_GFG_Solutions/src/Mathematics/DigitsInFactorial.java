package Mathematics;

public class DigitsInFactorial {

	public static long digitsInFactorial(int n){
        double digits = 0;
        for(int i=2;i<=n;i++)
            digits += Math.log10(i);
        return (long)digits+1;
    }
	
	public static void main(String[] args) {
		System.out.println(digitsInFactorial(42));
	}

}
