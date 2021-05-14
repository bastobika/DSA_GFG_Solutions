package Mathematics;

import java.util.ArrayList;

public class Basics {

	public static int absolute(int I) {
        return Math.abs(I);
    }
	
	public static double cToF(int C) {
        return (double)((C * 9/5)+32);
    }
	
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int root1 = 0, root2 = 0;
        int temp = (int)(Math.pow(b, 2) - 4*a*c); 
        if(temp < 0)
            result.add(-1);
        else
        {
            root1 = (int)Math.floor((-1*b + Math.sqrt(temp))/(2 *a)); 
            root2 = (int)Math.floor((-1*b - Math.sqrt(temp))/(2 *a));
            if(root1 > root2){
                result.add(root1);
                result.add(root2);
            }else{
                result.add(root2);
                result.add(root1);
            }
        }
        return result;
    }
	
	public static boolean isPrime(int N) {
	      for(int i=2;i<=Math.sqrt(N);i++){
	          if(N%i == 0)
	            return false;
	      }
	      return true;
	}
	
	public static double termOfGP(int A,int B,int N) {
        return A*Math.pow((double)B/A,N-1);
    }
	
	private static int computePower(int x, int y) {
		if(y==0)
				return 1;
		return x*computePower(x,y-1);
	}

	public static long sumUnderModulo(long a, long b){
        long mod = 1000000007;
        return (a%mod + b%mod)%mod;
    } 
	
	static long multiplicationUnderModulo(long a, long b){
        long mod = 1000000007;
        return ((a%mod)*(b%mod))%mod;
    }
	
	public static void main(String[] args) {
		System.out.println("Absolute Value of -32 is = " + absolute(-32));
		System.out.println("32 Degree Celcius in Fahrenheit is = " + cToF(32));
		System.out.println("Quadratic Roots are : ");
		ArrayList<Integer> result = quadraticRoots(1,-2,1);
		for(int i=0;i<result.size();i++)
				System.out.print(result.get(i) + " ");
		System.out.println("\n49 is prime or not " + isPrime(49));
		System.out.println("GP Term = "+termOfGP(1,3,5));
		System.out.println("2 to the power of 3 is "+computePower(2,3));
		Long a = 9223372036854775807L;
		Long b = 9223372036854775807L;
		System.out.println("Addition under modulo is " + sumUnderModulo(a,b));
		System.out.println("Multiplication under modulo is " + multiplicationUnderModulo(a,b));
	}

}
