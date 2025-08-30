package leetCode.divideAndConquer;

import java.util.Arrays;

public class FindMax {

    /**
     * Finds the maximum value in an array using a recursive divide-and-conquer approach.
     * @param arr The array to search.
     * @param lower The starting index of the sub-array.
     * @param upper The ending index of the sub-array.
     * @return The maximum value found in the specified sub-array.
     */
    public static int findMax(int[] arr, int lower, int upper) {
        // Base case: If the sub-array has only one element.
        if (lower == upper) return arr[lower];
        int mid = lower + (upper - lower) / 2;
        int leftMax = findMax(arr, lower, mid);
        int rightMax = findMax(arr, mid + 1, upper);
        return Math.max(leftMax, rightMax);
    }

    /**
     * Main method to run the test cases.
     * It handles different scenarios and prints the results.
     */
    public static void main(String[] args) {
        // Test case 1: Standard array with a mix of numbers
        int[] testArray1 = {10, 5, 20, 8, 15, 30, 25};
        int result1 = findMax(testArray1, 0, testArray1.length - 1);
        System.out.println("Array: " + Arrays.toString(testArray1) + " -> Max: " + result1);
        System.out.println("Expected: 30");
        System.out.println("Result is correct? " + (result1 == 30));
        System.out.println("-------------------------");

        // Test case 2: Array with a single element
        int[] testArray2 = {42};
        int result2 = findMax(testArray2, 0, testArray2.length - 1);
        System.out.println("Array: " + Arrays.toString(testArray2) + " -> Max: " + result2);
        System.out.println("Expected: 42");
        System.out.println("Result is correct? " + (result2 == 42));
        System.out.println("-------------------------");

        // Test case 3: Array with negative numbers
        int[] testArray3 = {-5, -10, -2, -1, -20};
        int result3 = findMax(testArray3, 0, testArray3.length - 1);
        System.out.println("Array: " + Arrays.toString(testArray3) + " -> Max: " + result3);
        System.out.println("Expected: -1");
        System.out.println("Result is correct? " + (result3 == -1));
        System.out.println("-------------------------");

        // Test case 4: Large array
        int[] testArray4 = new int[1000];
        for (int i = 0; i < 1000; i++) {
            testArray4[i] = i * 2;
        }
        int result4 = findMax(testArray4, 0, testArray4.length - 1);
        System.out.println("Array (size 1000) -> Max: " + result4);
        System.out.println("Expected: 1998");
        System.out.println("Result is correct? " + (result4 == 1998));
        System.out.println("-------------------------");

        // Test case 3: Array with negative numbers
        int[] testArray5 = {-5, -10};
        int result5 = findMax(testArray5, 0, testArray5.length - 1);
        System.out.println("Array: " + Arrays.toString(testArray5) + " -> Max: " + result5);
        System.out.println("Expected: -5");
        System.out.println("Result is correct? " + (result5 == -5));
        System.out.println("-------------------------");
    }
}