package leetCode.sort;

import java.util.Arrays;

public class MergeSort {

    /**
     * The main function that sorts the array A[lower...upper] using merge sort.
     * It's the "Divide and Conquer" part of the algorithm.
     * * @param A The array to be sorted.
     * @param lower The starting index of the sub-array.
     * @param upper The ending index of the sub-array.
     */
    public static void mergeSort(int[] A, int lower, int upper) {
        // Base case: If the sub-array has one or zero elements, it's already sorted.
        if (lower >= upper) {
            return;
        }

        // Find the midpoint to divide the array into two halves.
        int mid = lower + (upper - lower) / 2;

        // Recursively sort the left half.
        mergeSort(A, lower, mid);

        // Recursively sort the right half.
        mergeSort(A, mid + 1, upper);

        // Merge the two sorted halves.
        merge(A, lower, mid, upper);
    }

    /**
     * Merges two sorted sub-arrays of A.
     * The first sub-array is A[lower...mid].
     * The second sub-array is A[mid+1...upper].
     * * @param A The original array.
     * @param lower The starting index of the first sub-array.
     * @param mid The ending index of the first sub-array.
     * @param upper The ending index of the second sub-array.
     */
    private static void merge(int[] A, int lower, int mid, int upper) {
        // Create a temporary array to hold the merged result.
        int[] temp = new int[upper - lower + 1];
        int i = lower; // Pointer for the left sub-array.
        int j = mid + 1; // Pointer for the right sub-array.
        int k = 0; // Pointer for the temporary array.

        // Compare elements from both sub-arrays and add the smaller one to temp.
        while (i <= mid && j <= upper) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }

        // Copy any remaining elements from the left sub-array.
        while (i <= mid) {
            temp[k++] = A[i++];
        }

        // Copy any remaining elements from the right sub-array.
        while (j <= upper) {
            temp[k++] = A[j++];
        }

        // Copy the sorted elements from the temporary array back to the original array.
        for (i = 0; i < temp.length; i++) {
            A[lower + i] = temp[i];
        }
    }

    // Main method to test the Merge Sort algorithm with various test cases.
    public static void main(String[] args) {
        // Test Case 1: Standard array
        int[] testArray1 = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(testArray1));
        mergeSort(testArray1, 0, testArray1.length - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(testArray1));
        System.out.println("------------------------------------");

        // Test Case 2: Already sorted array
        int[] testArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(testArray2));
        mergeSort(testArray2, 0, testArray2.length - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(testArray2));
        System.out.println("------------------------------------");

        // Test Case 3: Reverse sorted array
        int[] testArray3 = {10, 9, 8, 7, 6, 5};
        System.out.println("Original Array: " + Arrays.toString(testArray3));
        mergeSort(testArray3, 0, testArray3.length - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(testArray3));
        System.out.println("------------------------------------");

        // Test Case 4: Array with duplicates
        int[] testArray4 = {5, 2, 8, 2, 5, 1};
        System.out.println("Original Array: " + Arrays.toString(testArray4));
        mergeSort(testArray4, 0, testArray4.length - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(testArray4));
        System.out.println("------------------------------------");

        // Test Case 5: Empty array
        int[] testArray5 = {};
        System.out.println("Original Array: " + Arrays.toString(testArray5));
        mergeSort(testArray5, 0, testArray5.length - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(testArray5));
        System.out.println("------------------------------------");

        // Test Case 6: Array with a single element
        int[] testArray6 = {42};
        System.out.println("Original Array: " + Arrays.toString(testArray6));
        mergeSort(testArray6, 0, testArray6.length - 1);
        System.out.println("Sorted Array:   " + Arrays.toString(testArray6));
        System.out.println("------------------------------------");
    }
}
