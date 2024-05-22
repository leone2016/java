package DSA_Dinesh_Varuani._8_linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,10,20,47,59,63,75,88,99,107,120,133,155,162,176,188,199,200,210,222};
        int key = 0;
        System.out.println(linearSearch(arr, key));
        System.out.println(binarySearch(arr, key));
        System.out.println("Search insert position: " + searchInsert(arr, key));
    }

    /**
     * Class 130
     * Linear search algorithm
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param arr
     * @param key
     * @return
     */
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * class 131
     * Binary search algorithm
     * Time complexity: O(log n)
     * Space complexity: O(1)
     *
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    /**
     * class 132
     *
     * (LeetCode) Search insert Position in a sorted array
     *
     * Q. Given a sorted array of distinct integer and a target value, return the index if the target is found. if not, return the index where it would be if it were inserted in order
     * the algorithm should run in O(log n) time complexity
     * Example 1:
     * Input: nums = [1, 3, 5, 6], target = 5
     * Output: 2 // 5 is at index 2
     *
     * Example 2:
     * Input: nums = [1, 3, 5, 6], target = 2
     * Output: 1 //insert 2 at index 1
     *
     * Example 3:
     * Input: nums = [1, 3, 5, 6], target = 7
     * Output: 4 //insert 7 at index 4
     *
     * Example 4:
     * Input: nums = [1, 3, 5, 6], target = 0
     * Output: 0 //insert 0 at index 0
     */
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
