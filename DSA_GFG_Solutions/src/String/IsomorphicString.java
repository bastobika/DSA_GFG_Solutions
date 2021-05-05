package String;

public class IsomorphicString {

	/* If 'x' of str1 and 'b' of str2 are mapped to each other because they occured in the same index for the first time, then at every index of str1 having 'x'
	there should be 'b' in str2 */
	public static boolean areIsomorphic(String str1,String str2){
        if(str1.length() != str2.length())
            return false;
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        for(int i=0;i<256;i++){
            arr1[i] = -1;
            arr2[i] = -1;
        }
        for(int i=0;i<str1.length();i++){
            if(arr1[str1.charAt(i)] != arr2[str2.charAt(i)]) 
                return false;
            arr1[str1.charAt(i)] = i;
            arr2[str2.charAt(i)] = i;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(areIsomorphic("aab","xxy"));
	}

}
