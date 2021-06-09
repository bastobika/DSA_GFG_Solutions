package DynamicProgramming;

import java.math.BigInteger;

public class NthCatalanNumber {

	//Nth Catalan Number = (2n !)/n ! * (n+1) !  
	public static BigInteger findCatalan(int n){
        BigInteger prev = new BigInteger("1");
        BigInteger current = new BigInteger("0");
        for(int i=1;i<=n;i++){
            BigInteger mul = new BigInteger(Integer.toString(2*i*(2*i-1)));
            current = prev.multiply(mul);
            BigInteger div = new BigInteger(Integer.toString(i*(i+1)));
            current = current.divide(div);
            prev = current;
        }
        return current;
    }
	
	public static void main(String[] args) {
		System.out.println(findCatalan(10));
	}

}
