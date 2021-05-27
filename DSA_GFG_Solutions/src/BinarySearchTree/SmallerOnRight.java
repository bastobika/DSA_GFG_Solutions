package BinarySearchTree;

import java.util.Scanner;
import java.util.TreeSet;

public class SmallerOnRight {

private static int maxElem;
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<testCases;i++){
		    maxElem = 0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j=0;j<n;j++)
		        arr[j] = sc.nextInt();
    		for(int k=n-1;k>=0;k--){
    		    set.add(arr[k]);
    		    maxElem = Math.max(maxElem,set.headSet(arr[k]).size());
    		}
    		set.clear();
    		System.out.println(maxElem);
    		sc.close();
		}
	}

}
