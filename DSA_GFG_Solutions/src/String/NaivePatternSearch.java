package String;

public class NaivePatternSearch {

	//Naive - O(n*m) where n and m are the size of the pattern and text respectively (Pattern may have repetitive characters)
	static boolean search(String pat, String txt){
        boolean present = false;
        if(pat.length() > txt.length())
            return present;
        for(int i=0;i<txt.length();i++){
            if(pat.charAt(0) == txt.charAt(i)){
                present = true;
                for(int j=1;j<pat.length();j++){
                    if(((i+j) >= txt.length()) || 
                        ((i+j) < txt.length() && pat.charAt(j) != txt.charAt(i+j))){
                        present = false;
                        break;
                    }
                }
                if(present)
                    return present;
            }
        }
        return present;
    }
	
	public static void main(String[] args) {
		System.out.println(search("abc","abcdef"));
	}

}
