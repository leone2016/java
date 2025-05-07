package leetCode;

public class MaxAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;

        // Sumar los primeros k elementos
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double windowSum = maxSum;

        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{4,2,1,3,3}, 2)); // 3.00000
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4)); // 12.75
        System.out.println(findMaxAverage(new int[]{5}, 1));               // 5.0
    }

}
