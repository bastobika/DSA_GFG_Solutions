package Hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static int NumberofElementsInIntersection (int a[], int b[] , int n, int m) {
	    Set<Integer> set = new HashSet<Integer>();
	    int count = 0;
	    for(int i=0;i<n;i++)
	        set.add(a[i]);
	    for(int i=0;i<m;i++){
	        if(set.contains(b[i])){
	            count++;
	            set.remove(b[i]);   //Removing the elements once matched to avoid double count
	        }
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		int[] a = {89,5,4,1};
		int[] b = {4,2,89,33,78};
		System.out.println(NumberofElementsInIntersection(a,b,4,5));
	}

}
