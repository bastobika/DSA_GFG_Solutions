package String;

public class Isogram {

	static boolean isIsogram(String data){
        int arr[] = new int[256];
        for(int i=0;i<data.length();i++){
            if(arr[data.charAt(i)] != 0)
                return false;
            arr[data.charAt(i)]++;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isIsogram("geeksforgeeks"));
	}

}
