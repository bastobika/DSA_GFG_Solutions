package Recursion;

public class RopeCuttingProblem {

	private static int ropeCuttingProblem(int n,int a,int b,int c) {
		if(n == 0)
			return 0;
		int cutA = n < a ? -1 : ropeCuttingProblem(n%a,a,b,c);
		if(cutA != -1)
			cutA += n/a;
		int cutB = n < b ? -1 : ropeCuttingProblem(n%b,a,b,c);
		if(cutB != -1)
			cutB += n/b;
		int cutC = n < c ? -1 : ropeCuttingProblem(n%c,a,b,c);
		if(cutC != -1)
			cutC += n/c;
		return Math.max(cutA,Math.max(cutB, cutC));
	}
	
	public static void main(String[] args) {
		System.out.println(ropeCuttingProblem(5,2,5,1));
		System.out.println(ropeCuttingProblem(23,12,9,11));
		System.out.println(ropeCuttingProblem(5,4,2,6));
	}
	
}
