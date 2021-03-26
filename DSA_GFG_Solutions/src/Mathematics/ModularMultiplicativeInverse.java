package Mathematics;

public class ModularMultiplicativeInverse {

	public static int modInverse(int a, int m) {
        int count = 1;
        while(count < m){
            if((count*a)%m == 1)
                return count;
            else
                count++;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		System.out.println(modInverse(3,11));
	}
}
