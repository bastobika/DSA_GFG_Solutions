package Stack;

import java.util.ArrayDeque;

public class PreviousGreaterElement {

	private static void previousGreater(int arr[], int n) {
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		for(int i=0;i<n;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) 
				arr[stack.pop()] = stack.size() == 0 ? -1 : arr[stack.peek()];
			stack.push(i);
		}
		while(!stack.isEmpty()) 
			arr[stack.pop()] = stack.size() == 0 ? -1 : arr[stack.peek()];
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
	}
	public static void main(String[] args) {
		int arr[] = {15,10,18,12,4,6,2,8};
		previousGreater(arr,8);
	}

}
