package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        // List to hold the result triplets
        List<List<Integer>> result = new ArrayList<>();
        // Sort the array to make it easier to skip duplicates and use two pointers
        Arrays.sort(nums);
        // Iterate through the array, fixing one element at a time
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same elements to avoid duplicates in the result
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // Two-pointer approach: initialize two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // If the sum is zero, we've found a valid triplet
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    // Move the pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to the right to increase the sum
                    left++;
                } else {
                    // If the sum is greater than zero, move the right pointer to the left to decrease the sum
                    right--;
                }
            }
        }

        // Return the list of triplets
        return result;
    }
    public static void main(String[] args) {
        _15_3Sum solution = new _15_3Sum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums1));  // Output: [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {0, 1, 1};
        System.out.println(solution.threeSum(nums2));  // Output: []

        int[] nums3 = {0, 0, 0};
        System.out.println(solution.threeSum(nums3));  // Output: [[0, 0, 0]]
    }
}
