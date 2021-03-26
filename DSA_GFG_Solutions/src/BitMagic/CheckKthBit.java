package BitMagic;

public class CheckKthBit {

	static boolean checkKthBit(int n, int k){
	       return (((n >> k) & 1) == 1);
	}
	
	public static void main(String[] args) {
		System.out.println(checkKthBit(4,2));
	}

}
