package String;

public class FirstLeftmostRepeatingCharacter {

	static int repeatedCharacter(String S){
        int arr[] = new int[256];
        int index = Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            if(arr[S.charAt(i)] != 0)
                index = Math.min(index,arr[S.charAt(i)]);
            arr[S.charAt(i)] = i+1;
        }
        return index == Integer.MAX_VALUE ? -1 : index-1;
    }
	
	public static void main(String[] args) {
		System.out.println(repeatedCharacter("geeksforgeeks"));
	}

}
