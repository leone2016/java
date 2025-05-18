package leetCode;

public class NumArray {
    public NumArray() {

    }

    private int[] prefixSum;
    public NumArray(int[] nums) {
        this.prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;

        for(int i = 0; i < nums.length ; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right +1] - prefixSum[left];
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2)); // 1
        System.out.println(numArray.sumRange(2, 5)); // -1
        System.out.println(numArray.sumRange(0, 5)); // -3
    }
}
