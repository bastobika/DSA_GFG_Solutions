package String;

public class KeypadTyping {

	private static String findDecimal(char c){
	    if(c == 'a' || c == 'b' || c == 'c')
	        return "2";
	    if(c == 'd' || c == 'e' || c == 'f')
	        return "3";
	    if(c == 'g' || c == 'h' || c == 'i')
	        return "4";
	    if(c == 'j' || c == 'k' || c == 'l')
	        return "5";
	    if(c == 'm' || c == 'n' || c == 'o')
	        return "6";
	    if(c == 'p' || c == 'q' || c == 'r' || c == 's')
	        return "7";
	    if(c == 't' || c == 'u' || c == 'v')
	        return "8";
	    return "9";
	}

	public static String printNumber(String s, int n) {
	    String result = "";
	    for(int i=0;i<n;i++)
	        result += findDecimal(s.charAt(i));
	    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(printNumber("abcidh",6));
	}

}
