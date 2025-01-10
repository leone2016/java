package leetCode;

public class _14_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string in the array as the initial prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix by comparing it with the current string
            var test1 = strs[i].indexOf(prefix);
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length by one character each time
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Example usage:
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);  // Output: "fl"
    }
}
