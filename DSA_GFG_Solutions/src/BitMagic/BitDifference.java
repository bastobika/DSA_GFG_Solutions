package BitMagic;

public class BitDifference {

	public static int countBitsFlip(int a, int b){
        int xorResult = a^b;
        int count = 0;
        while(xorResult > 0){
            if((xorResult & 1) == 1)
                count++;
            xorResult = xorResult >> 1;
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(countBitsFlip(20,25));
	}

}
