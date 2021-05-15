package Stack;

import java.util.ArrayDeque;

public class EvaluationOfPrefix {

	private static boolean isSymbol(String x) {
		if(x.equalsIgnoreCase("*") || x.equalsIgnoreCase("/") || x.equalsIgnoreCase("+") || x.equalsIgnoreCase("-") || x.equalsIgnoreCase("^"))
			return true;
		return false;
	}
	
	private static int evaluatePrefix(String str) {
		String arr[] = str.split(" ");
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>(); 
		for(int i=arr.length-1;i>=0;i--) {
			String c = arr[i];
			if(!isSymbol(c))
				stack.push(Integer.parseInt(c));
			else 
				stack.push(calculate(stack.pop(),stack.pop(),c));
		}
		return stack.pop();
	}
	
	private static int calculate(int a, int b, String x) {
		if(x.equalsIgnoreCase("+"))
			return a+b;
		if(x.equalsIgnoreCase("-"))
			return a-b;
		if(x.equalsIgnoreCase("*"))
			return a*b;
		if(x.equalsIgnoreCase("/"))
			return a/b;
		return (int)Math.pow(a,b);
	}

	public static void main(String[] args) {
		System.out.println(evaluatePrefix("+ * 10 2 3"));
		System.out.println(evaluatePrefix("* + 10 2 3"));
		System.out.println(evaluatePrefix("^ ^ 10 2 3"));
	}

}
