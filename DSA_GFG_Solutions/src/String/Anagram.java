package String;

public class Anagram {

	public static boolean isAnagram(String a,String b){
        int arr[] = new int[256];
        for(int i=0;i<a.length();i++)
            arr[a.charAt(i)]++;
        for(int i=0;i<b.length();i++)
            if(arr[b.charAt(i)] > 0)
                arr[b.charAt(i)]--;
            else
                arr[b.charAt(i)]++;
        for(int i=0;i<256;i++)
            if(arr[i] > 0)
                return false;
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram("amazon","maznoa"));
	}

}
