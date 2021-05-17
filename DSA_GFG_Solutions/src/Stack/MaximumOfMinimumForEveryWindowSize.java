package Stack;

import java.util.ArrayDeque;

public class MaximumOfMinimumForEveryWindowSize {

static int[] maxOfMin(int[] arr, int n) {
        
        //window[i] indicates the window in which arr[i] is the minimum element
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		int window[] = new int[n];
		int ans[] = new int[n];
		for(int i=0;i<n;i++) {
			while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) 
				window[stack.pop()] = stack.size() == 0 ? i-(-1)-1 : i-stack.peek()-1;
			stack.push(i);
		}
		while(!stack.isEmpty()) 
			window[stack.pop()] = stack.size() == 0 ? n : n-stack.peek()-1;
			
		//ans[i] will have the maximum of the minimum values for all window[i]
		for(int i=0;i<n;i++)
		    ans[window[i]-1] = Math.max(arr[i],ans[window[i]-1]);
		  
		/* The windows for which the value is 0, they have no direct element which is
		  the maximum element. So it will be same as i+1 */
		for(int i=n-2;i>=0;i--)
		    ans[i] = Math.max(ans[i],ans[i+1]);
		return ans;
    }

	public static void main(String[] args) {
		int arr[] = {10,20,30,50,10,70,30};
		int result[] = maxOfMin(arr,7);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i] + " ");
	}

}
