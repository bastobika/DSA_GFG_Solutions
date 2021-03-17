package Stack;

import java.util.Stack;

public class GetMinAtPop {

private static Stack<Integer> minStack;
    
    /* inserts elements of the array into 
        stack and return the stack*/
    public static Stack<Integer> _push(int arr[],int n)  {
        Stack<Integer> stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        minStack.push(arr[0]);
        for(int i=0;i<n;i++){
            if(!minStack.empty() && minStack.peek() > arr[i])
                minStack.push(arr[i]);
            stack.push(arr[i]);
        }
        return stack;
    }
    
    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer> stack)  {
        while(!stack.empty()){
            System.out.print(minStack.peek()+" ");
            if(stack.pop() == minStack.peek())
                minStack.pop();
        }
    }
    
	public static void main(String[] args) {
		int[] arr = {5,3,8,2,6,1,0,8,1,9};
		_getMinAtPop(_push(arr,10));
	}

}
