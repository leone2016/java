package HackerRank.Day1.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[100]; // Because 0 < a[i] < 100

        // Count frequency of each number
        for (int num : a) {
            freq[num]++;
        }

        int max = 0;

        // Compare current and next to form valid subset
        for (int i = 0; i < freq.length - 1; i++) {
            max = Math.max(max, freq[i] + freq[i + 1]);
        }

        return max;
    }

    /**
     * init arrayList with 1, 1, 2, 2, 4, 4, 5, 5, 5
     * @param args
     */
    public static void main(String[] args) {
        Integer arr[] = {1, 1, 2, 2, 4, 4, 5, 5, 5};
        List<Integer> list = Arrays.asList(arr);
        int result = pickingNumbers(list);
        System.out.println("Maximum length of subset: " + result);
    }
}
