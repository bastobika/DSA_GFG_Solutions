package String;

import java.util.ArrayDeque;

public class NthNumberMadeOfPrimeDigits {

	public static int primeDigits(int n){
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        if(n == 1)
            return 2;
        if(n == 2)
            return 3;
        if(n == 3)
            return 5;
        if(n == 4)
            return 7;
        queue.offer(2);
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        int i=5;
        while(i <= n){
            int elem= queue.poll();
            if(i == n)
                return elem*10+2;
            queue.offer(elem*10+2);
            i++;
            if(i == n)
                return elem*10+3;
            queue.offer(elem*10+3);
            i++;
            if(i == n)
                return elem*10+5;
            queue.offer(elem*10+5);
            i++;
            if(i == n)
                return elem*10+7;
            queue.offer(elem*10+7);
            i++;
        }
        return 0;
    }
	
	public static void main(String[] args) {
		System.out.println(primeDigits(10));
	}

}
