package leetCode.monotonicStack;

import java.util.Stack;

public class _456Pattern132 {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); // nums[k]
            }

            stack.push(nums[i]); // potential nums[j]
        }

        return false;
    }
    public static void main(String[] args) {
        _456Pattern132 sol = new _456Pattern132();
        System.out.println(sol.find132pattern(new int[]{3, 1, 4, 2}));       // true
        System.out.println(sol.find132pattern(new int[]{-1, 3, 2, 0}));     // true
        System.out.println(sol.find132pattern(new int[]{1, 2, 3, 4}));      // false
    }
}
