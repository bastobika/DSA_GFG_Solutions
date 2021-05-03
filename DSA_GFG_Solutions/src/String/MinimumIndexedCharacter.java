package String;

public class MinimumIndexedCharacter {

	public static int minIndexChar(String str, String patt){
        int index = Integer.MAX_VALUE;
        int arr[] = new int[256];
        for(int i=0;i<patt.length();i++)
            arr[patt.charAt(i)]++;
        for(int i=0;i<str.length();i++)
            if(arr[str.charAt(i)] > 0)
                index = Math.min(index,i);
        return index == Integer.MAX_VALUE ? -1 : index;
    }
	
	public static void main(String[] args) {
		System.out.println(minIndexChar("geeksforgeeks","set"));
	}

}
