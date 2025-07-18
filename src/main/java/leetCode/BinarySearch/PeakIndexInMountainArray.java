package leetCode.BinarySearch;

/**
 * You are given an integer mountain array arr of length n
 * where the values increase to a peak element and then decrease.
 *
 * Return the index of the peak element.
 *
 * Your task is to solve it in O(log(n)) time complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [0,1,0]
 *
 * Output: 1
 *
 * Example 2:
 *
 * Input: arr = [0,2,1,0]
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Ascending → go right
                left = mid + 1;
            } else {
                // Descending → go left (or mid could be peak)
                right = mid;
            }
        }

        return left; // or right, since left == right
    }

    public static void main(String[] args) {
        PeakIndexInMountainArray solution = new PeakIndexInMountainArray();
        System.out.println(solution.peakIndexInMountainArray(new int[]{0, 10, 5, 2}));    // Output: 1
        System.out.println(solution.peakIndexInMountainArray(new int[]{0, 1, 0}));        // Output: 1
        System.out.println(solution.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));     // Output: 1
    }
}

