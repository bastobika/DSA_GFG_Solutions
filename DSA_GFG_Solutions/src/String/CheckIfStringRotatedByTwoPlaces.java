package String;

public class CheckIfStringRotatedByTwoPlaces {

	public static boolean isRotated(String str1, String str2){
        int n = str1.length();
        if(n == 1)
            return str1.equalsIgnoreCase(str2);
        return (str1.substring(2) + str1.substring(0,2)).equalsIgnoreCase(str2)
        || (str1.substring(n-2) + str1.substring(0,n-2)).equalsIgnoreCase(str2);
    }
	
	public static void main(String[] args) {
		System.out.println(isRotated("amazon","onamaz"));
	}

}
