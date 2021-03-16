	package Stack;

public class StackUsingArray {
	int top;
	int arr[] = new int[1000];

	StackUsingArray() {
		top = -1;
	}
	
    void push(int a) {
	    arr[++top] = a;
	} 

	int pop() {
	    if(top == -1)
	        return top;
        return arr[top--];
	}
	
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(6);;
		stack.push(10);
		stack.pop();
		stack.push(11);
		for(int i=0;i<stack.top+1;i++) 
			System.out.println(stack.arr[i]);
	}
}
