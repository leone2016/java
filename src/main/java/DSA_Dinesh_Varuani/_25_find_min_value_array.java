package DSA_Dinesh_Varuani;

public class _25_find_min_value_array {
    /**
     * - class 25, 26
     * Q. Given an array of integers, find minimum value in the array
     * Input: arr = { 2, 11, 5 ,10, 7, 8}
     * Output: 2
     */
    public static void main(String[] args) {
        int[] arr = { 2, 11, 5 ,10, 7, 8};
        int n = arr.length;
        int min = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
