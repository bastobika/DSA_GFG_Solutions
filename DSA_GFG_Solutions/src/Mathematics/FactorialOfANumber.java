package Mathematics;

public class FactorialOfANumber {

	private static long calculateFactorial(int N){
        if(N == 0 || N == 1)
            return 1;
        return N*calculateFactorial(N-1); 
    }
    
    public static long factorial(int N) {
        return calculateFactorial(N);
    }
    
	public static void main(String[] args) {
		System.out.println("Factorial of 4 is "+factorial(4));
	}

}
