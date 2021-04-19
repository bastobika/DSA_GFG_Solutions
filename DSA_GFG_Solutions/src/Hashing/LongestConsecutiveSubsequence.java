package Hashing;

import java.util.HashSet;
import java.util.TreeSet;

public class LongestConsecutiveSubsequence {

	//Not efficient - O(nlogn)
	static int findLongestConseqSubseqUsingTreeSet(int arr[], int N) {
	    TreeSet<Integer> set = new TreeSet<Integer>();
	    for(int i=0;i<N;i++)
	        set.add(arr[i]);
	    int count = 1;
	    int longestCount = 0;
	    int temp = set.first();
	    for(int a: set){
	        if(a != temp && a == temp+1){
	            count++;
	            temp++;
	        }else{ 
	            count = 1;
	            temp = a;
	        }
	        longestCount = Math.max(longestCount,count);
	    }
	    return longestCount;
	}
	
	//Efficient - O(n)
	static int findLongestConseqSubseqUsingHashSet(int arr[], int N) {
	    int length = 0; int maxLength = 0;
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i=0;i<N;i++)
	        set.add(arr[i]);
	    int temp = 0;
	    for(int i=0;i<N;i++){
	        if(!set.contains(arr[i]-1)){   //Enter if only when arr[i] is the beginning of a subsequence. If arr[i]-1 is present means arr[i] cannot be the beginning of the longest subsequence. So skip. This ensures O(n) complexity.
	            length = 1;
	            temp = arr[i];
	            while(set.contains(temp+1)){
	                length++;
	                temp++;
	            }
	            maxLength = Math.max(length,maxLength);
	            length = 0;
	        }
	   }
	    return maxLength;
	}
	
	public static void main(String[] args) {
		int a[] = {2,6,1,9,4,5,3};
		System.out.println(findLongestConseqSubseqUsingHashSet(a,7));
	}

}
