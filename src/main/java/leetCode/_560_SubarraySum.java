package leetCode;
import java.util.Map;
import java.util.HashMap;
/**
 * 560. Subarray Sum Equals K
 *
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 */
public class _560_SubarraySum {

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        for (int num : nums) {
            sum += num;//prefix sum

            // ¿hay una suma parcial anterior que permitiría formar suma == k?
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,1,2,1}, 3)); // 4
    }
}
