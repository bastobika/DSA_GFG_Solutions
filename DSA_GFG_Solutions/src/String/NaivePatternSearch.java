package String;

public class NaivePatternSearch {

	//Naive - O(n*m) where n and m are the size of the pattern and text respectively
	static boolean search(String pat, String txt){
        return txt.contains(pat);
    }
	
	public static void main(String[] args) {
		System.out.println(search("abc","abcdef"));
	}

}
