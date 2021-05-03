package String;

public class ReverseWordsInAString {

	//Not Efficient - O(n^2)
    static String reverseWordsSol1(String S){
        String result = "";
        String word = "";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '.'){
                result += reverse(word) + ".";
                word = "";
            }else
                word += S.charAt(i);
        }
        return reverse(result);
    }
    
    private static String reverse(String str){
        String result = "";
        for(int i=0;i<str.length();i++)
            result = str.charAt(i) + result;
        return result;
    } 
    
    //Efficient - O(n)
    static String reverseWordsSol2(String S){
        String[] arr = S.split("\\.");
        String result = "";
        for(int i=arr.length-1;i>=0;i--)
            result += arr[i] + ".";
        return result.substring(0,result.length()-1);
    }
    
	public static void main(String[] args) {
		System.out.println(reverseWordsSol2("i.like.you"));
	}

}
