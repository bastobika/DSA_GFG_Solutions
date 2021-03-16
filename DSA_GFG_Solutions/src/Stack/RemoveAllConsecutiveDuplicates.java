package Stack;

import java.util.Stack;

public class RemoveAllConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(!stack.empty() && str.charAt(i) == stack.peek())
                continue;
            stack.push(str.charAt(i));
        }
        String result ="";
        while(!stack.empty())
            result = stack.pop() + result;
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aaaaaabaabccccccc"));
	}

}
