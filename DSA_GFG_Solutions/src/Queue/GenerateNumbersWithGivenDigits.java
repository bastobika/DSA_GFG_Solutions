package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GenerateNumbersWithGivenDigits {

	static ArrayList<String> generate(int N) {
        String element = "";
        ArrayDeque<String> queue = new ArrayDeque<String>();
        ArrayList<String> result = new ArrayList<String>();
        queue.offer("5");
        queue.offer("6");
        while(result.size() != N){
            element = queue.poll();
            result.add(element);
            queue.offer(element + "5");
            queue.offer(element + "6");
        }
        return result;
    }

	public static void main(String[] args) {
		ArrayList<String> result = generate(10);
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
	}

}
