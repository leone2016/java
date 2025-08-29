package leetCode.twoPointers;
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        String best = "";
        int n = s.length();

        for (int center = 0; center < n; center++) {
            // Caso 1: Longitud impar (centro en un solo carácter)
            best = expand(s, center, center, best);
            // Caso 2: Longitud par (centro entre dos caracteres)
            best = expand(s, center, center + 1, best);
        }

        return best;
    }

    private static String expand(String s, int left, int right, String best) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int length = right - left - 1;
        if (length > best.length()) {
            best = s.substring(left + 1, right);

        }

        return best;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // "bab" o "aba"
        System.out.println(longestPalindrome("cbbd"));  // "bb"
        System.out.println(longestPalindrome("a"));     // "a"
        System.out.println(longestPalindrome("ac"));    // "a" o "c"
    }
}
