package Stack;

import java.util.ArrayDeque;

public class InfixToPostfix {

	private static int priority(Character x){
        if(x == '^') return 3;
        if(x == '*' || x == '/') return 2;
        if(x == '+' || x == '-') return 1;
        return 0;
    }
    private static boolean isSymbol(Character x){
        if(x == '^' || x == '*' || x == '/' 
            || x == '+' || x == '-') return true;
        return false;
    }
	public static String infixToPostfix (String exp) {
	    Character c;
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		String result = "";
		for(int i=0;i<exp.length();i++){
		    c = exp.charAt(i);
		    if(isSymbol(c)){
		        while(!stack.isEmpty() && priority(stack.peek()) >= priority(c))
		            result += stack.pop();
		        stack.push(c);
		    }
		    else if(c == '(')
		        stack.push(c);
		    else if(c == ')'){
		        while(stack.peek() != '(')
		            result += stack.pop();
		        stack.pop();
		    }else
		        result += c;
		    
		}
		while(!stack.isEmpty()){
		    if(stack.peek() != '(') 
		        result += stack.pop();
		}
		return result;
	} 
	public static void main(String[] args) {
		System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
	}

}
