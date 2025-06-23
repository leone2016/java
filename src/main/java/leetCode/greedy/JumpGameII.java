package leetCode.greedy;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, end = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int curr = i + nums[i];
            farthest = Math.max(farthest, curr);

            if (i == end) {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        JumpGameII solver = new JumpGameII();
       // System.out.println(solver.jump(new int[]{2, 3, 1, 1, 4})); // 2
        System.out.println(solver.jump(new int[]{2,4,1,2,3,1,1,2})); // 3
    }
}