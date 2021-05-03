package String;

public class BinaryString {

	public static int binarySubstring(int a, String str) {
        boolean begin = false;
        int count = 0;
        int oneCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                if(begin){
                    oneCount++;
                    count = count + oneCount;
                }else
                    begin = true;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(binarySubstring(11,"00100111001"));
	}

}
