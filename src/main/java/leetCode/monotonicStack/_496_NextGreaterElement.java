package leetCode.monotonicStack;
import  java.util.*;
public class _496_NextGreaterElement {
    /**
     * Given two arrays nums1 and nums2, return an array of the same length as nums1
     * such that each element in the array corresponds to the next greater element
     * in nums2 for the corresponding element in nums1.
     * If no such element exists, output -1 for that position.
     *
     * @param nums1 The first array
     * @param nums2 The second array
     * @return An array of the next greater elements
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from left to right
        for (int num : nums2) {
            // Maintain a decreasing stack
            while (!stack.isEmpty() && num > stack.peek()) {
                Integer smaller = stack.pop();
                nextGreaterMap.put(smaller, num); // num is the next greater for smaller
            }
            stack.push(num);
        }

        // For elements that have no next greater, map will not contain them → default to -1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }

    public static void main(String[] args) {
        _496_NextGreaterElement sol = new _496_NextGreaterElement();

        System.out.println(Arrays.toString(sol.nextGreaterElement(
                new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}))); // [-1, 3, -1]

        System.out.println(Arrays.toString(sol.nextGreaterElement(
                new int[]{2, 4}, new int[]{1, 2, 3, 4}))); // [3, -1]
    }
}
