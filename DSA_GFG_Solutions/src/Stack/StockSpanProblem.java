package Stack;

import java.util.ArrayDeque;

public class StockSpanProblem {

	public static int[] calculateSpan(int price[], int n) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && price[stack.peek()] <= price[i])
                stack.pop();
            if(stack.isEmpty())
                result[i] = i+1;
            else
                result[i] = i - stack.peek();
            stack.push(i);
        } 
        return result;
    }
	public static void main(String[] args) {
		int arr[] = {100,80,60,70,60,75,85};
		arr = calculateSpan(arr,7);
		for(int i=0;i<7;i++)
			System.out.print(arr[i] + " ");
	}

}
