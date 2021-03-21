package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class DeleteMidOfAStack {

	public Stack<Integer> deleteMid(Stack<Integer> s,int sizeOfStack) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int mid = sizeOfStack % 2 == 0 ? sizeOfStack/2 - 1 : sizeOfStack/2;
        for(int i=sizeOfStack-1;i>mid;i--)
            stack.push(s.pop());
        s.pop();
        while(!stack.isEmpty())
            s.push(stack.pop());
        return s;
        
        /* By using inBuilt method without usind additional Data Structure
        if(!s.isEmpty())
            s.remove(mid); */
    }
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		DeleteMidOfAStack deleteMid = new DeleteMidOfAStack();
		s = deleteMid.deleteMid(s, 5);
		while(!s.isEmpty())
			System.out.println(s.pop());
	}

}
