package Mathematics;

public class HCFAndLCM {

	private static int HCF(int a,int b) {
		if(b%a == 0)
			return a;
		return HCF(b%a,a);	
	}
	
	private static int LCM(int a,int b) {
		int i = 1;
		while(a*i % b != 0)
			i++;
		return a*i;
	} 
	
	private static int LCMUsingHCF(int a,int b) {
		return (a*b)/HCF(a,b);
	} 
	
	public static void main(String[] args) {
		System.out.println(HCF(4,6));
		System.out.println(HCF(12,15));
		System.out.println(HCF(7,13));
		System.out.println(LCM(4,6));
		System.out.println(LCM(12,15));
		System.out.println(LCMUsingHCF(2,8));
		System.out.println(LCMUsingHCF(3,7));
	}

}
