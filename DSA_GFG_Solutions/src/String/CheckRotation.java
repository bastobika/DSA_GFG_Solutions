package String;

public class CheckRotation {

	public static boolean areRotations(String s1, String s2 ){
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }
	
	public static void main(String[] args) {
		System.out.println(areRotations("amazon","onamaz"));
	}

}
