package BitMagic;

public class PowerOfTwo {

	public static boolean isPowerofTwo(long n){
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                if(count == 0)
                    count++;
                else
                    return false;
            }
            n = n >> 1;    
        }
        return count == 1 ? true : false;
        
        /*Easier Solution
        if(n == 0)
        	return false;
        return (n&(n-1)) == 0; */
    }
	
	public static void main(String[] args) {
		System.out.println(isPowerofTwo(3));
	}

}
