package leetCode;

public class _283_MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int l = 0;
        for(int r =0; r< nums.length;r++){
            if(nums[r] != 0){
              //swap left index with right index
                int acum = nums[l] ;
                nums[l] = nums[r];
                nums[r] = acum;
                l++;
            }
        }

    }



    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);

    }
}

/*
BEST SOLUTION 0ms
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0; // Count of zeros encountered
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                shiftZeros(nums, i, zeroCount);
                break; // Stop after finding the first zero
            }
        }
    }

    // Shifts non-zero elements left and counts zeros
    private static void shiftZeros(int[] arr, int index, int zeroCount) {
        zeroCount++; // Increment zero count
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                shiftZeros(arr, j, zeroCount); // Recursive call for next zero
                return;
            }
            arr[j - zeroCount] = arr[j]; // Shift non-zero elements left
        }
        // Fill remaining elements with zeros at the end
        for (int k = 1; k <= zeroCount; k++) {
            arr[arr.length - k] = 0;
        }
    }
}

*/
