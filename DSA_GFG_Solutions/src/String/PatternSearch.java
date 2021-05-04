package String;

public class PatternSearch {

	// O(N+M) where N and M are size of pattern and text respectively but pattern will only have distinct characters - use sliding window technique
	static boolean search(String pat, String txt){
        if(pat.length() > txt.length())
            return false;
        int j = 0;
        for(int i=0;i<txt.length();i++){
            while(i<txt.length() && pat.charAt(j) == txt.charAt(i)){
                j++;
                i++;
                if(j == pat.length())
                    return true;
            }
            j = 0;
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(search("abc","abeabc"));
	}

}
