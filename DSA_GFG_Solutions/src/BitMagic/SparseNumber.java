package BitMagic;

public class SparseNumber {

	public static boolean isSparse(int n){
        while(n > 0){
            if(((n&1) == 1) && (((n&2) >> 1) == 1))
                return false;
            n = n >> 1;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isSparse(3));
	}

}
