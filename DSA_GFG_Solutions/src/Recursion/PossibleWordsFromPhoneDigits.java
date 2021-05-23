package Recursion;

import java.util.ArrayList;

public class PossibleWordsFromPhoneDigits {

	static ArrayList <String> possibleWords(int a[], int N) {
        ArrayList<String> result = new ArrayList<String>();
        if(N == 0){
            result.add("");
            return result;
        }
        result.addAll(possibleWords(a,N-1));
        int size = result.size();
        String letters = characters(a[N-1]);
        for(int i=0;i<size;i++){
            String str = result.remove(0);
            for(int j=0;j<letters.length();j++)
                result.add(str + letters.charAt(j));
        }
        return result;
    }
    
    private static String characters(int x) {
        switch(x) {
            case 2 : return "abc";
            case 3 : return "def";
            case 4 : return "ghi";
            case 5 : return "jkl";
            case 6 : return "mno";
            case 7 : return "pqrs";
            case 8 : return "tuv";
            case 9 : return "wxyz";
            default : return "";
        }
    }
    
	public static void main(String[] args) {
		int arr[] = {2,3,4};
		System.out.println(possibleWords(arr,3));
	}

}
