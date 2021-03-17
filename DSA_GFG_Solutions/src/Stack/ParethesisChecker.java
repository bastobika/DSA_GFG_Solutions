package Stack;

import java.util.Stack;

public class ParethesisChecker {

	static boolean compare(Character a ,  Character b) {
        if((a == '}' && b =='{') || (a == ']' && b == '[') || (a == ')' && b == '('))
            return true;
        return false;
    }
    
    static boolean isPar(String x)  {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) == ']' || x.charAt(i) == '}' || x.charAt(i) == ')'){
                if(!stack.empty() && compare(x.charAt(i),stack.peek())){
                    stack.pop();
                    continue;
                }else
                    return false;
            }else
                stack.push(x.charAt(i));
        }
        if(!stack.empty())
            return false;
        return true;
    }
    
	public static void main(String[] args) {
		System.out.println(isPar("{([])}"));
	}

}
