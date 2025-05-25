package leetCode;
import java.util.*;

public class _525_ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // sum 0 seen before index 0

        int maxLen = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        _525_ContiguousArray ca = new _525_ContiguousArray();
        //System.out.println(ca.findMaxLength(new int[]{0, 1}));               // 2
       // System.out.println(ca.findMaxLength(new int[]{0, 1, 0}));           // 2
        System.out.println(ca.findMaxLength(new int[]{0,1,1,1,1,1,0,0,0})); // 6
    }
}
