package leetCode;

public class _11_ContainerMostWater {

    public static int maxArea(int[] height){
        // Initialize two pointers: one at the beginning and one at the end of the array
        int left = 0;
        int right = height.length -1;
        // Initialize a variable to store the maximum area found
        int maxArea = 0;
        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the width between the two pointers
            int width = right - left;
            // Calculate the area using the shorter of the two lines (heights)
            int currentArea = Math.min(height[left], height[right]) * width;
            // Update maxArea if the current area is larger
            maxArea = Math.max(maxArea, currentArea);
            // Move the pointer pointing to the shorter line inward to try and find a larger area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height1));  // Output: 49

        int[] height2 = {1, 1};
        System.out.println(maxArea(height2));  // Output: 1
    }
}
