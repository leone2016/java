package HackerRank.Day1.week1;
import java.util.Arrays;
import java.util.List;

/**
 *  modulo buckets
 * modulo frequency approach.
 * This reduces time complexity from O(n²) to O(n) in practice
 */
public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int[] freq = new int[k];
        int count = 0;

        // Count frequency of each remainder
        for (int num : ar) {
            int test = num % k;
            freq[test]++;
        }

        // Pairs where both remainders are 0
        count += freq[0] * (freq[0] - 1) / 2;

        // Pairs with complementary remainders
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                count += freq[i] * freq[k - i];
            }
        }

        // If k is even, handle the middle remainder
        if (k % 2 == 0) {
            count += freq[k / 2] * (freq[k / 2] - 1) / 2;
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5, 6);
        int k = 5;
        int res = divisibleSumPairs(ar.size(), k,  ar);

        System.out.println(res);
    }
}
