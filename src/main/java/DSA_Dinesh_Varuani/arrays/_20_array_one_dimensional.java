package DSA_Dinesh_Varuani.arrays;

public class _20_array_one_dimensional {
    /**
     * What is an array?
     * It is a collection of similar type of elements that have a contiguous memory location.
     * CLASS 18
     * @param args
     */
    public static void main(String[] args) {
      printArray(new int[]{1, 2, 3, 4, 5});
    }

    private static void printArray(int[] arr ) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
