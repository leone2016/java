package leetCode;

import java.util.*;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class _1_twoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> trackMap = new HashMap<Integer, Integer>();
        int[] retArray = new int[2];

        for(int i = 0 ;i<nums.length;i++){
            int diff = target-nums[i];
            if(trackMap.containsKey(diff)){
                retArray[0] = trackMap.get(diff);
                retArray[1] = i ;
                return retArray ;
            }else{
                trackMap.put(nums[i], i);
            }
        }
        return null ;
    }

//    public int[] twoSum(int[] nums, int target) {
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i]+nums[j] == target){
//                    result.add(i);
//                    result.add(j);
//                }
//            }
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }

    public static void main(String[] args) {
        int[] test1 = {2,  11,7, 15};
        int[] test2 = {3, 4, 2};
        int[] test3 = {3, 3};

        int target1 = 9, target2 = 6, target3 = 6;

        _1_twoSum ts = new _1_twoSum();
        int[] result1 = ts.twoSum(test1, target1);
        int[] result2 = ts.twoSum(test2, target2);
        int[] result3 = ts.twoSum(test3, target3);
        Arrays.stream(result1).forEach(System.out::print);
        System.out.println();
        Arrays.stream(result2).forEach(System.out::print);
        System.out.println();
        Arrays.stream(result3).forEach(System.out::print);
    }
}
