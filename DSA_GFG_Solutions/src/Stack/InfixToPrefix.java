package Stack;

import java.util.ArrayDeque;

public class InfixToPrefix {

	private static  int getPrecedence(char x) {
		if(x == '^')
			return 3;
		if(x == '*' || x == '/')
			return 2;
		if(x == '+' || x == '-')
			return 1;
		return 0;
	}
	
	private static boolean isSymbol(char x) {
		if(x == '*' || x == '/' || x == '+' || x == '-' || x == '^' || x == '(' || x ==')')
			return true;
		return false;
	}
	
	private static String infixToPrefix(String str) {
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			if(isSymbol(c)) {
				if(c == '(') {
					while(!stack.isEmpty() && stack.peek() != ')')
						result = stack.pop() + result;
					if(!stack.isEmpty()) 	
						stack.pop();
				}else if(c != ')') {
					while(!stack.isEmpty() && getPrecedence(stack.peek()) > getPrecedence(c))
						result = stack.pop() + result;
					if(!stack.isEmpty() && c == '^')                 //to maintain associative rule
						result = stack.pop() + result;
				}
				if(c != '(')
					stack.push(c);
			}else
				result = c + result;
		}
		while(!stack.isEmpty())
			result = stack.pop() + result;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(infixToPrefix("x+y*(z-w)"));
		System.out.println(infixToPrefix("x+y*z/w+u"));
		System.out.println(infixToPrefix("x^y^z"));
	}

}
