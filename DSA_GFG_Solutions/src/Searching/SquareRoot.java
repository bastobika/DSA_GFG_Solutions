package Searching;

public class SquareRoot {

	static long floorSqrt(long x){
        if(x == 1)
            return 1;
		long begin = 0;
		long end = x;
		long mid = 0;
		while(begin < end-1){
		    mid = (begin + end)/2;
		    if(mid*mid > x)
		        end = mid;
		    else if(mid*mid < x)
		        begin = mid;
		    else
		        return mid;
		}
		return begin;
	 }
	
	public static void main(String[] args) {
		System.out.println(floorSqrt(5));
	}

}
