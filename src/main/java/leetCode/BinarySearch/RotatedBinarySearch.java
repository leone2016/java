package leetCode.BinarySearch;

public class RotatedBinarySearch {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // search in left half
                } else {
                    left = mid + 1; // search in right half
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // search in right half
                } else {
                    right = mid - 1; // search in left half
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        RotatedBinarySearch solver = new RotatedBinarySearch();

        System.out.println(solver.search(new int[]{6,7,3,4,5}, 5)); // Output: 4
        System.out.println(solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // Output: -1
        System.out.println(solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)); // Output: -1
        System.out.println(solver.search(new int[]{1}, 0));                 // Output: -1
    }
}
