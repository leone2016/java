package DSA_Dinesh_Varuani.arrays;

public class _23_reverse_array {
    /**
     * - class 23, 24
     * Q. Given an array of integers or string, return an array with elements reversed
     * Input: arr = { 2, 11, 5 ,10, 7, 8}
     * Output: {8, 7, 10, 5, 11, 2}
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 2, 11, 5 ,10, 7, 8};
        int n = arr.length;
        int[] rev = new int[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            rev[j] = arr[i];
            j++;
        }
        for(int i = 0; i<n; i++){
            System.out.print(rev[i] + " ");
        }
    }
}
