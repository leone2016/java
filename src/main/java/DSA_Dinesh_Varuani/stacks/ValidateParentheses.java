package DSA_Dinesh_Varuani.stacks;
import java.util.Stack;
/**
 * Q. Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 *
 * Example 1:
 * Input: "()" Output: true
 * Input: "{()}" Output: true
 * Input: "()[]{}" Output: true
 * Input: "(]" Output: false
 * Input: "([)]" Output: false
 */
public class ValidateParentheses {

    public static void main(String[] args) {
        //create all test cases
        String s = "()";
        System.out.println(isValid(s));

        String s2 = "{()}";
        System.out.println(isValid(s2));

        String s3 = "()[]{}";
        System.out.println(isValid(s3));

        String s4 = "(]";
        System.out.println(isValid(s4));

        String s5 = "([)]";
        System.out.println(isValid(s5));

    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);

            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if (
                        ( top == '(' &&  c == ')' ) ||
                                (top == '{' && c == '}') ||
                                (top == '[' && c == ']')
                ){
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
