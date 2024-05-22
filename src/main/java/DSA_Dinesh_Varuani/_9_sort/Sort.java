package DSA_Dinesh_Varuani._9_sort;

import java.util.Arrays;

/**
 * Class 133
 * Bubble sort
 * It is also called as sinking sort
 * while appling this sorting algorithm on unsorted array, the largest elements tends to sink ar the end of the array.
 * It repeatedly compares pai of adjacent and swap them if they are in wrong order.
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\n (bubble-Sort) Sorted array: ");
        printArray(arr);
        System.out.println("\n (insertion-Sort) Sorted array: ");
        int[] arr2 = {33, 11, 22, 44, 55, 77, 66};
        printArray(arr2);
        sort(arr2);
        System.out.println("\n  (insertion-Sort) Sorted array: ");
        printArray(arr2);
    }
    /**
     * Class 134
     * Bubble sort algorithm
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n-1; i++) {
            isSwapped = false;
            int max = n-i-1;
            for (int j = 0; j < max; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    /**
     * Class 136 - 137 - 138
     * Insertion sort
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     *
     * - Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
     * - In Insertion sort we divide the given array into two parts sorted part and unsorted part.
     * - From unsorted part, we take first element and place at its correct position in sorted array.
     *      This is done by shifting all elements to right of the current element to one position ahead.
     * - Its repeated until no unsorted elements are left.
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1; // index of previous element
            while (j >= 0 && arr[j] > temp) { // move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void printArray(int[] arr){
        Arrays.stream(arr).mapToObj(i -> i + " | ").forEach(System.out::print);
        System.out.println();
    }
}
