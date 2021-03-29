package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GenerateBinaryNumbers {

	static ArrayList<String> generateNaive(int N){
       ArrayList<String> result = new ArrayList<String>();
        String temp = "";
        int value = 0;
        for(int i=1;i<=N;i++){
            value = i;
            while(value > 0){
                temp = String.valueOf(value%2) + temp;
                value = value/2;
            }
            result.add(temp);
            temp = "";
        }
        return result; 
	}
    
	static ArrayList<String> generateEfficient(int N) {
        String element = "";
        ArrayDeque<String> queue = new ArrayDeque<String>();
        ArrayList<String> result = new ArrayList<String>();
        queue.offer("1");
        while(result.size() != N){
            element = queue.poll();
            result.add(element);
            queue.offer(element + "0");
            queue.offer(element + "1");
        }
        return result;
    }

	public static void main(String[] args) {
		ArrayList<String> result = generateEfficient(6);
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
	}

}
