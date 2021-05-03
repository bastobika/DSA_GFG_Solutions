package String;

public class Pangram {

	public static boolean checkPangram  (String str){
        str = str.toLowerCase();
        int arr[] = new int[26];
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) - 'a' >= 0 && str.charAt(i) - 'a' <=26)
                arr[str.charAt(i) - 'a']++;
        for(int i=0;i<26;i++)
            if(arr[i] == 0)
                return false;
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(checkPangram("abcd"));
	}

}
