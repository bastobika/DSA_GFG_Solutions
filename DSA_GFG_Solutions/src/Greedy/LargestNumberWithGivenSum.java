package Greedy;

public class LargestNumberWithGivenSum {

	static String largestNumber(int n, int sum) {
        if(sum > n*9)
            return "-1";
        String password = "";
        while(n > 0){
            n--;
            if(sum >= 9){
                password += "9";
                sum -= 9;
            }else{
                password += Integer.toString(sum);
                sum = 0;
            }
        }
        return password;
    }
	
	public static void main(String[] args) {
		System.out.println(largestNumber(5,13));
	}

}
