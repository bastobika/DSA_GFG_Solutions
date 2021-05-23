package BitMagic;

public class PowerSetUsingBitwise {

	private static void solution(String str) {
		for(int i=0;i<Math.pow(2, str.length());i++) {
			String result = "";
			int count = 0;
			int n = i;
			while(n > 0) {
				if((n & 1) == 1)
					result = result + str.charAt(count);
				count++;
				n = n >> 1;
			}
			System.out.print(result + " ");			
		}
	}
	
	public static void main(String[] args) {
		solution("abc");
	}

}
