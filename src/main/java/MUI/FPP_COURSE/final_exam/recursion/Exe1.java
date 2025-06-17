package MUI.FPP_COURSE.final_exam.recursion;

import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an array of characters
 * s.
 */
public class Exe1 {

    public static void main(String[] args) {

        char string[] = new char[]{'H', 'e', 'l', 'l', 'o', 'w' , ' ', 'W', 'o', 'r', 'l', 'd'};

        char reverse[] = reverseString(string);

        System.out.print(Arrays.toString(reverse));

    }

    private static char[] reverseString(char[] string) {

        return reverseStringIndex(string,0,  string.length-1);
    }

    private static char[] reverseStringIndex(char[] string, int left, int right) {
        if(left>right){
            return string;
        }
        char temp = string[left];
        string[left] = string[right];
        string[right] = temp;
        return reverseStringIndex(string, ++left,--right);
    }
}
