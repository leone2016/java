package leetCode;

public class TrappingRainWater {

    public static int trap(int[] height) {
        if (height == null || height.length < 3) return 0;

        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] h1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] h2 = {4,2,0,3,2,5};

        System.out.println(trap(h1)); // 6
        System.out.println(trap(h2)); // 9
    }
}