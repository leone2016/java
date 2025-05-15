package leetCode;
import java.util.*;

public class BalancedPermutations {

    /*
     * | Caracter | Código ASCII |
     * | -------- | ------------ |
     * | `'0'`    | 48           |
     * | `'1'`    | 49           |
     * | `'2'`    | 50           |
     * | `'3'`    | 51           |
     * | ...      | ...          |
     */
    public static int countBalancedPermutations(String num) {

        return 0;
    }

    private static void backtrack(Map<Character, Integer> freq, char[] perm, int pos) {

    }


   /* private static boolean isBalanced(char[] perm) {

    }*/

    public static void main(String[] args) {
        System.out.println(countBalancedPermutations("123"));    // 2
        //result = 0;
        System.out.println(countBalancedPermutations("112"));    // 1
        //result = 0;
        System.out.println(countBalancedPermutations("12345"));  // 0
    }
}
