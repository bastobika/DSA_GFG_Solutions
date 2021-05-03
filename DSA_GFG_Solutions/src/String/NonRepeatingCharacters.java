package String;

public class NonRepeatingCharacters {

	static char nonrepeatingCharacter(String S){
        int arr[] = new int[26];
        for(int i=0;i<S.length();i++)
            arr[S.charAt(i) - 'a']++;
        for(int i=0;i<S.length();i++)
            if(arr[S.charAt(i) - 'a'] == 1)
                return S.charAt(i);
        return '$';
    }
	
	public static void main(String[] args) {
		System.out.println(nonrepeatingCharacter("hello"));
	}

}
