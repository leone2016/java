package leetCode.slidingWindow_Dynamic;

public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            // Shrink window while it's valid
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        MinSubArrayLen sol = new MinSubArrayLen();
        System.out.println(sol.minSubArrayLen(11, new int[]{1,2,3,4,5})); // 3
        System.out.println(sol.minSubArrayLen(4, new int[]{1,4,4}));       // 1
        System.out.println(sol.minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1})); // 0
    }
}
