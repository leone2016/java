package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_twoSum {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result.add(i);
                    result.add(j);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

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
