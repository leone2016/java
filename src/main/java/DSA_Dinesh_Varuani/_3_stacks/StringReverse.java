package DSA_Dinesh_Varuani._3_stacks;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
    }

    /*
     * class 89
     * Reverse a string using stack
     */
    public static String reverseString(String str) {
        int n = str.length();
        java.util.Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c: chars) {
            stack.push(c);
        }
        for (int i = 0; i < n; i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
