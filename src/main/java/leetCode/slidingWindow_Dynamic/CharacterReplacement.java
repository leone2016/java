package leetCode.slidingWindow_Dynamic;

public class CharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26]; // For uppercase A-Z
        int left = 0, maxCount = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If window is invalid, shrink it
            int test = right - left + 1;
            int win  =  (test) - maxCount;
            while (win > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the maxLength if this window is valid
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "ABAB";
        int k1 = 2;
        System.out.println("Input: " + s1 + ", k = " + k1);
        System.out.println("Output: " + characterReplacement(s1, k1)); // 4

        String s2 = "AABABBA";
        int k2 = 1;
        System.out.println("Input: " + s2 + ", k = " + k2);
        System.out.println("Output: " + characterReplacement(s2, k2)); // 4

        String s3 = "AAAA";
        int k3 = 2;
        System.out.println("Input: " + s3 + ", k = " + k3);
        System.out.println("Output: " + characterReplacement(s3, k3)); // 4

        String s4 = "ABCDE";
        int k4 = 1;
        System.out.println("Input: " + s4 + ", k = " + k4);
        System.out.println("Output: " + characterReplacement(s4, k4)); // 2
    }
}
