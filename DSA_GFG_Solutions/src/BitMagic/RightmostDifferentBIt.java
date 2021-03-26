package BitMagic;

public class RightmostDifferentBIt {

	public static int posOfRightMostDiffBit(int m, int n) {
        if(m == n) return -1;
        int count = 0;
        while(((m^n) & 1) != 1){
            count++;
            m = m >> 1;
            n = n >> 1;
        }       
        return count+1; 
    }
	
	public static void main(String[] args) {
		System.out.println(posOfRightMostDiffBit(11,9));
	}

}
