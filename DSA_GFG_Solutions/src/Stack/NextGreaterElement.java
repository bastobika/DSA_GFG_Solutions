package Stack;

import java.util.ArrayDeque;

public class NextGreaterElement {

	public static long[] nextLargerElement(long[] arr, int n) { 
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i])
                arr[stack.pop()] = arr[i];
            stack.push(i);
        }
        while(!stack.isEmpty())
            arr[stack.pop()] = -1;
        return arr;
    } 
	public static void main(String[] args) {
		long[] arr = {6,8,0,1,3};
		arr = nextLargerElement(arr,5);
		for(int i=0;i<5;i++)
			System.out.print(arr[i]+" ");
	}

}
