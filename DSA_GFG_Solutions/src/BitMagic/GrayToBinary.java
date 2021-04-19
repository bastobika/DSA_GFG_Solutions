package BitMagic;

public class GrayToBinary {

	public static int grayToBinary(int n) {
        int result = n;
        while( n > 0){
            n = n >> 1;
            result = result ^ n;
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(grayToBinary(4));
	}

}
