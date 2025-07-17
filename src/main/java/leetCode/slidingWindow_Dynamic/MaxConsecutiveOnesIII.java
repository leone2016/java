package leetCode.slidingWindow_Dynamic;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeros = 0;
        int maxLength = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++; // shrink the window
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesIII sol = new MaxConsecutiveOnesIII();

        System.out.println(sol.longestOnes(
                new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)); // Output: 6

        System.out.println(sol.longestOnes(
                new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3)); // Output: 10
    }
}
