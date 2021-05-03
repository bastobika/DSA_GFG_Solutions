package String;

public class RemoveCommonCharacters {

	public static String concatenatedString(String s1,String s2){
        int arr[] = new int[256];
        for(int i=0;i<s1.length();i++)
            arr[s1.charAt(i)] = 1;
        for(int i=0;i<s2.length();i++)
            if(arr[s2.charAt(i)] == 1 || arr[s2.charAt(i)] == 3)
                arr[s2.charAt(i)] = 3;
            else
                arr[s2.charAt(i)] = 2;
        String result = "";
        for(int i=0;i<s1.length();i++)
            if(arr[s1.charAt(i)] == 1)
                result += s1.charAt(i);
        for(int i=0;i<s2.length();i++)
            if(arr[s2.charAt(i)] == 2)
                result += s2.charAt(i);
        return result == "" ? "-1" : result;
    }
	
	public static void main(String[] args) {
		System.out.println(concatenatedString("abdhkk","vbh"));
	}

}
