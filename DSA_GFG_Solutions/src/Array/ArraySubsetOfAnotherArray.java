package Array;

import java.util.HashSet;

public class ArraySubsetOfAnotherArray {

	public static String isSubset( long a1[], long a2[], long n, long m) {
        HashSet<Long> set = new HashSet<Long>();
        for(int i=0;i<m;i++)
            set.add(a2[i]);
        int count = 0;
        for(int i=0;i<n;i++)
            if(set.contains(a1[i]))
                count++;
        if(count == set.size())
            return "Yes";
        return "No";
    }
	
	public static void main(String[] args) {
		long arr1[] = {5,4,7,6,2,8};
		long arr2[] = {4,5,8,2};
		System.out.println(isSubset(arr1,arr2,6,4));
	}

}
