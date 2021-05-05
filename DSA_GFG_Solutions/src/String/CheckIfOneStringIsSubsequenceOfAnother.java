package String;

public class CheckIfOneStringIsSubsequenceOfAnother {

	public static boolean isSubSequence(String A, String B){
        int j=0;
        for(int i=0;i<B.length();i++){
            if(B.charAt(i) == A.charAt(j)){
                j++;
                if(j == A.length())
                    return true;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isSubSequence("ale","apple"));
	}
}
