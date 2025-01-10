package leetCode;

public class _58_length_of_lastWord {
    public static int lengthOfLastWord(String s) {
        // Trim any trailing spaces from the string
        s = s.trim();

        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');

        // The length of the last word is the difference between
        // the length of the string and the index of the last space
        var test = s.length();
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        // Example usage:
        String s = "   fly me   to   the moon  ";
        int length = lengthOfLastWord(s);
        System.out.println("Length of last word: " + length);  // Output: 5
    }
}
