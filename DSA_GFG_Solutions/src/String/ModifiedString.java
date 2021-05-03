package String;

public class ModifiedString {

	public static long modified(String a){
        int count = 0;
        int k = 1;
        char c = a.charAt(0);
        for(int i=1;i<a.length();i++){
            if(a.charAt(i) == c)
                k++;
            else{
                k = 1;
                c = a.charAt(i);
            }
            if(k == 3){
                count++;
                k = 1;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(modified("aaabbbabbb"));
	}

}
