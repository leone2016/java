package leetCode;

import javax.print.attribute.IntegerSyntax;
import java.util.Stack;

public class _150_reverse_polish_notation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> values = new Stack<>();
        String operators = "+ - * / ";
        for (int i = 0; i < tokens.length; i++) {
            var test = operators.indexOf(tokens[i]);
            if(operators.contains(tokens[i])){
                values.push(operation(tokens[i],values.pop(), values.pop()));
            }else{
                values.push(Integer.valueOf(tokens[i]));
            }
        }
        return values.pop();
    }

    public static int operation(String operator, int b, int a){
        if(operator.equals("+"))
            return a + b;
        if(operator.equals("-"))
            return a - b;
        if(operator.equals("/"))
            return a / b;
        if(operator.equals("*"))
            return a * b;
        return 0;
    }

    public static void main(String[] args) {
        // Example usage:
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evalRPN(tokens);
        System.out.println("Result: " + result);  // Output: 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        result = evalRPN(tokens2);
        System.out.println("Result: " + result);  // Output: 6

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        result = evalRPN(tokens3);
        System.out.println("Result: " + result);  // Output: 22
    }
}
