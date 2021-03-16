package Stack;

import java.util.Stack;

public class BasicOperations {

    public static void insert(Stack<Integer> st, int x) {
        st.push(x);
    }
    
    public static void remove(Stack<Integer> st) {
        int x =    st.pop();
        System.out.println(x + " has been removed. ");
    }

    public static void headOfStack(Stack<Integer> st) {
        int x = st.peek();
        System.out.println(x + " is the head of the stack.");
    }
    
    public static boolean find(Stack<Integer> st, int val) {
        boolean exists = false;
        if(!(st.search(val) == -1))
        	exists = true;
        if(exists == true)
            return true;
        return false;
    }
	public static void main(String[] args) {
		BasicOperations basic = new BasicOperations();
		Stack<Integer> stack = new Stack<Integer>();
		BasicOperations.insert(stack, 5);
		BasicOperations.insert(stack, 10);
		BasicOperations.headOfStack(stack);
		BasicOperations.remove(stack);
	}

}
