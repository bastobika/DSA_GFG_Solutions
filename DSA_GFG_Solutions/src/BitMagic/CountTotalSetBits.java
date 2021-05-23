package BitMagic;

public class CountTotalSetBits {

	private static int countTotalSetBits(int n) {
	        int count = 0;
	        int bits = 2;
	        int ones = 1;
	        n++;
	        int temp = n;
	        while(n > 0){
	            count += (temp/bits)*ones;
	            if(temp%bits > bits/2)
	                count += (temp%bits-bits/2);   //To count remainder ones
	            bits = bits*2;
	            ones = ones*2;
	            n = n >> 1;
	        }
	        return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countTotalSetBits(17));
	}

}
