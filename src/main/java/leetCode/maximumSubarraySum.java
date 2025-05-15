package leetCode;

/**
 * 2461. Maximum Sum of Distinct Subarrays With Length K
 */
public class maximumSubarraySum {

    public static long maximumSubarraySum(int[] nums, int k) {
        int maxValue = 0;
        int duplicateCount = 0;
        int len = nums.length;
        long sum = 0;
        long maxSum = 0;

        for (int num : nums) {
            maxValue = Math.max(num, maxValue);
        }

        int[] status = new int[maxValue + 1];

        for (int i = 0; i < len; i++) {

            if (++status[nums[i]] > 1) duplicateCount++;
            sum += nums[i];

            if (i >= k - 1) {
                int prevStart = i - k + 1;

                if (duplicateCount == 0) {
                    maxSum = Math.max(maxSum, sum);
                }

                if (--status[nums[prevStart]] != 0) duplicateCount--;
                sum -= nums[prevStart];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1,5,4,2,9,9,9}, 3));//15
        System.out.println(maximumSubarraySum(new int[]{4,1,5,1}, 2));//6
    }

}
