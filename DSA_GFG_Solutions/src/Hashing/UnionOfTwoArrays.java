package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

	public static int doUnion(int a[], int n, int b[], int m) {
		Set<Integer> set = new HashSet<Integer>();
	    for(int i=0;i<n;i++)
	        set.add(a[i]);
	    for(int i=0;i<m;i++)
	        set.add(b[i]);
	    return set.size();
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {5,6,7,8};
		System.out.println(doUnion(a,5,b,4));
	}

}
