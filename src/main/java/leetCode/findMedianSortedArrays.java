package leetCode;

public class findMedianSortedArrays {

    static double findMedianArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;
        // Ensure nums1 is the smaller array for binary search convenience
        if (m > n) {
            return findMedianArrays(nums2, nums1);
        }
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) {
                    return ((double)Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double)Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");

    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,2,5,6};
        int[] nums2 = {2,7};
        System.out.println(findMedianArrays(nums1, nums2));

        int[] nums3 = {1,3};
        int[] nums4 = {2};
        System.out.println(findMedianArrays(nums3, nums4));
    }
}
