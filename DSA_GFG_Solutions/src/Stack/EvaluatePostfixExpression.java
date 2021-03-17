package Stack;

import java.util.ArrayDeque;

public class EvaluatePostfixExpression {

	private static boolean isSymbol (Character x) {
        if(x == '*' || x == '/' || x == '^' || x == '+' || x == '-')
            return true;
        return false;
    } 
    
    private static Integer operate (Integer b, Integer a, Character x) {
        if(x == '*') return a*b;
        if(x == '/') return a/b;
        if(x == '+') return a+b;
        if(x == '-') return a-b;
        if(x == '^') return a^b;
        return 0;
    }
    public static int evaluatePostFix (String S) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for(int i=0;i<S.length();i++){
            if(!stack.isEmpty() && isSymbol(S.charAt(i))){
                stack.push(operate(stack.pop(),stack.pop(),S.charAt(i)));
                continue;
            }
            stack.push(Integer.parseInt(String.valueOf(S.charAt(i))));
        }
        return stack.pop();
    }
    
	public static void main(String[] args) {
		System.out.println(evaluatePostFix("231*+9-"));
	}

}
