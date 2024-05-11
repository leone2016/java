package DSA_Dinesh_Varuani.stacks;

import java.util.Stack;
/**
 * Q. Given an array of integer. for each element in the array, find its next greater element in the array.
 *
 * The next greater element is the first element towards right, which is greater than the current element.
 *
 * Example-
 * Input: [4,7,3,4,8,1]
 * Output: [7,8,4,8,-1,-1]
 *
 * i=0 -> 4 -> 7 =               7
 *  i=1 -> 7 -> 3,4,8 =          8
 *      i=2 -> 3 -> 4 =          4
 *          i=3 -> 4 -> 8 =      8
 *              i=4 -> 8 -> 1 = -1
 *               i= 5 -> 1 =    -1
 *
 */
public class NextGreaterElement {
public static void main(String[] args) {
        int[] arr = {4,7,3,4,8,1};
        int[] result = nextGreaterElement(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

}
