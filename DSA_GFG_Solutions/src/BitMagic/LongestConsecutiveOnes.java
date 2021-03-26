package BitMagic;

public class LongestConsecutiveOnes {

	public static int maxConsecutiveOnes(int N) {
        int maxOnes = 0;
        int count = 0;
        while(N > 0){
            if((N&1) == 1)
                count++;
            else{
                maxOnes = Math.max(maxOnes,count);
                count = 0;
            }
            N = N >> 1;
        }
        maxOnes = Math.max(maxOnes,count);
        return maxOnes;
    }
	
	public static void main(String[] args) {
		System.out.println(maxConsecutiveOnes(14));
	}

}
