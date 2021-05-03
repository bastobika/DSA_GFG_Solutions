package String;

public class SumOfNumbersInString {

	public static long findSum(String str){
        long sum = 0;
        for(int i=0;i<str.length();i++){
            String num = "";
            while(i < str.length() && isNumber(str.charAt(i))){
                num += str.charAt(i);
                i++;
            }
            if(num != "")
                sum += Long.parseLong(num);
        }
        return sum;
    }
    
    private static boolean isNumber(char x){
        if(x == '0' || x == '1' || x == '2' || x == '3' || x == '4'
           || x == '5' || x == '6' || x == '7' || x == '8' || x == '9')
           return true;
        return false;
    }
    
	public static void main(String[] args) {
		System.out.println(findSum("1gkd45nf4"));
	}

}
