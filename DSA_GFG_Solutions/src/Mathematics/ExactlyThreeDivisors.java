package Mathematics;

public class ExactlyThreeDivisors {

	public static int exactly3Divisors(int N){
        int count = 0;
        for(int i=2;i<=Math.sqrt(N);i++){
            boolean isPrime = true;
            for(int j=2;j<=Math.sqrt(i);j++)
                if(i%j == 0)
                    isPrime = false;
            if(isPrime)
                count++;
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(exactly3Divisors(25));
	}

}
