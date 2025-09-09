package MUI;

public class practica4_subset {
    public static void printRow(boolean row[]) {
        for (int j = 0; j < row.length; j++)
            if (row[j]) System.out.print(" T ");
            else System.out.print(" F ");
        System.out.println();
    }
    public static void SolveSubsetSum(int[] arr, int target) {
        int n = arr.length;
        boolean[] dp = new boolean[target + 1];

        //Initializing first row
        dp[0] = true;
        dp[arr[0]] = true;
        printRow(dp);

        for (int i = 1; i < n; i++) {
            int nextValue = arr[i];
            for (int j = target; j >= nextValue; j--) {
                dp[j] = dp[j - nextValue];
            }
            printRow(dp);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,6,8,16,18,20};
        //int[] arr = {5, 1, 2, 4}; //this will give wrong answer since arr is not sorted.
        int target = 38;
        SolveSubsetSum(arr, target);
    }
}