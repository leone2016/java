package leetCode.slidingWindow_Dynamic;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int[] charSet = new int[26];
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int left = 0;
        for(int right=0; right<n; right++){
            //System.out.println(s.charAt(right)  - 'a' );
            int indexChar = s.charAt(right) - 'a';

            //System.out.println("charSet[indexChar] "+ charSet[indexChar]);
            while(charSet[indexChar] > 0){
                int indexLeft= s.charAt(left) - 'a';
                charSet[indexLeft] = 0;
                left ++;
            }
            charSet[indexChar] ++ ;
            max = Math.max(max, right - left +1);

        }

        return max;
    }

    public static void main(String[] args) {
        LongestSubString solution = new LongestSubString();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);

        // example with pwwkew
        String input2 = "pwwkew";
        int result2 = solution.lengthOfLongestSubstring(input2);
        System.out.println("The length of the longest substring without repeating characters is: " + result2);
    }

}
