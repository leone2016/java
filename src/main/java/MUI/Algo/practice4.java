package MUI.Algo;

import java.util.ArrayList;
import java.util.List;

class OneSubSet{
    int[] val;

    public OneSubSet(int[] val) {
        this.val = val;
    }
}
public class practice4 {

    /**
     * subset sum: Write a Java program to solve the subset problem.
     * (a)	T or F.
     * RECURSION: BackTracking
     */
//    public static boolean isSubSet(int nums[], int n, int k){
//
//        if(k == 0) return true;
//        if(n == 0) return false;
//
//        if(nums[n-1]>){
//
//        }
//    }
    /**
     * subset sum: Write a Java program to solve the subset problem.
     * (a)	T or F.
     * NO-RECURSION: DP
     */
    public static boolean isSubsetSum(int[] nums, int target) {
        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][target + 1];


        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                var P = nums[i - 1];
                if ( P > j) {
                    var test = dp[i - 1][j];
                    dp[i][j] = dp[i - 1][j]; // exclude element
                } else {
                    var test = dp[i - 1][j] || dp[i - 1][j - P];
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - P];
                }
            }
        }

        return dp[n][target];
    }

    public static String subSutSumOneSolution(int[] nums, int target){
        int n = nums.length;
        String[][] dp = new String[n + 1][target + 1];


        for (int i = 0; i < n; i++) {
            dp[i+1][0] = ""+nums[i];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                var P = nums[i - 1];
                var prevVal= dp[i - 1][j];
                if ( P > j) {
                    var test = prevVal;
                    dp[i][j] = prevVal; // exclude element
                } else {
                    StringBuilder sb = new StringBuilder();
                    if(prevVal == null){
                        sb.append(dp[i][j - P]).append(",").append(P);
                    }else{
                        sb.append(prevVal);
                    }
                    dp[i][j] = sb.toString();
                }
            }
        }

        return dp[n][target];
    }



    public static void main(String[] args) {
//        int[] nums = {3, 34, 4, 12, 5, 2};
//        int target = 9;
        int[] nums = {2,3,5};
        int target = 8;

        System.out.println("DP Result TRUE FALSE: " + (isSubsetSum(nums, target) ? "True" : "False"));

        String s = subSutSumOneSolution(nums, target);
        System.out.println("DP Result TRUE FALSE: "+s);
    }
}
