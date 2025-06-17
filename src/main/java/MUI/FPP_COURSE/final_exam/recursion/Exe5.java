package MUI.FPP_COURSE.final_exam.recursion;

/**
 * Find the index of Max element in an array.
 */
public class Exe5 {
    public static int findMaxIndex(int[] arr, int index, int maxIndex) {
        if (index == arr.length) return maxIndex; // base case

        if (arr[index] > arr[maxIndex]) {
            maxIndex = index;
        }

        return findMaxIndex(arr, index + 1, maxIndex);
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 21, 9, 7};

        int maxIndex = findMaxIndex(arr, 1, 0); // start from index 1, maxIndex is 0
        System.out.println("Index of max element: " + maxIndex);
        System.out.println("Max element: " + arr[maxIndex]);
    }
}
