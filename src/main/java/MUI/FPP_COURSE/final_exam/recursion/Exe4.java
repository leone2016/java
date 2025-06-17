package MUI.FPP_COURSE.final_exam.recursion;

/**
 * Find the frequency of given element in an array: Given array containing duplicates, find
 * given element’s frequency.
 */
public class Exe4 {
    // Recursive method to count frequency
    public static int countFrequency(int[] arr, int target, int index) {
        if (index == arr.length) return 0; // base case

        // if match, add 1 and continue
        if (arr[index] == target) {
            return 1 + countFrequency(arr, target, index + 1);
        } else {
            return countFrequency(arr, target, index + 1);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 2, 5, 3};
        int target = 2;

        int frequency = countFrequency(arr, target, 0);
        System.out.println("Frequency of " + target + ": " + frequency);
    }
}
