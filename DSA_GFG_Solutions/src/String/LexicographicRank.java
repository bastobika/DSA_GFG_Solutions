package String;

import java.util.ArrayList;

public class LexicographicRank {

static int MOD = 1000000007;
    
    //Function to generate the list of factorials.
    static void initializeFactorials(int totalLen, ArrayList<Integer> fact) 
    {
        long factorial = 1;
        fact.add((int)1);
        for (int curIndex = 1; curIndex < totalLen; curIndex++) {
            factorial = (factorial * curIndex) % MOD;
            fact.add((int)factorial);
        }
        return;
    }
    
    //Function to find lexicographic rank of a string.
    static long findRank(String S) {
        int arr[] = new int[26];
        int n = S.length();
        for(int i=0;i<n;i++){
            arr[S.charAt(i)-'a']++;
            if(arr[S.charAt(i)-'a'] > 1)
                return 0;
        }
        int sum = 0;
        for(int i=0;i<26;i++){
            sum += arr[i];
            arr[i] = sum;
        }
        
        ArrayList<Integer> fact = new ArrayList<Integer>();
        initializeFactorials(n+1, fact);
        
        long rank = 0;
        for(int i=0;i<n;i++){
            if(arr[S.charAt(i)-'a'] > 0){
                rank = (rank+(arr[S.charAt(i)-'a']-1)*(long)fact.get(n-i-1))%MOD;
                for(int j=S.charAt(i)-'a';j<26;j++)
                    arr[j]--;
            }
            
        }
        return rank+1;
    }
    
	public static void main(String[] args) {
		System.out.println(findRank("string"));
	}

}
