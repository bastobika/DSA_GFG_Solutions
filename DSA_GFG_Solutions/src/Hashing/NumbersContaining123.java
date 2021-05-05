package Hashing;

import java.util.ArrayDeque;
import java.util.HashMap;

public class NumbersContaining123 {

	static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	public static void findAll(){
	    ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	    queue.offer(1);
	    queue.offer(2);
	    queue.offer(3);
	    while(!queue.isEmpty()){
	        int element = queue.poll();
	        map.put(element,1);
	        if(element <= 33333){
	            queue.offer(element*10+1);
	            queue.offer(element*10+2);
	            queue.offer(element*10+3);
	        }
	    }
	}
	
	public static void main(String[] args) {
		System.out.println("Numbers containing 1,2,3 are");
	}

}
