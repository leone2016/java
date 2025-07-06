package HackerRank.Day1.week4;

public class BeautifulSequence {
    /**
     * ✅ Conditions Recap:
     * Sequence must consist of at least two numbers.
     *
     * Each number is exactly 1 more than the previous.
     *
     * No leading zeros are allowed.
     *
     * Order cannot change.
     * @param s
     */
    public static void separateNumbers(String s) {
        int length = s.length();

        for (int i = 1; i <= length / 2; i++) {
            String startingNumber = s.substring(0, i);

            // Skip if the first number starts with 0 (not allowed)
            if (startingNumber.startsWith("0")) {
                continue;
            }

            long first = Long.parseLong(startingNumber);
            StringBuilder sequence = new StringBuilder();
            long num = first;

            // Build the sequence until it's the same length or longer than the original string
            while (sequence.length() < length) {
                sequence.append(num);
                num++;
            }

            // Check if the built sequence matches the input
            if (sequence.toString().equals(s)) {
                System.out.println("YES " + startingNumber);
                return;
            }
        }

        // If no valid sequence found
        System.out.println("NO");
    }

    public static void main(String[] args) {
        // Test inputs
        String[] testCases = {
                "1234",     // YES 1
                "91011",    // YES 9
                "99100",    // YES 99
                "101103",   // NO
                "010203",   // NO
                "13",       // NO
                "1"         // NO
        };

        for (String testCase : testCases) {
            System.out.print("Input: " + testCase + " → Output: ");
            separateNumbers(testCase);
        }
    }
}
