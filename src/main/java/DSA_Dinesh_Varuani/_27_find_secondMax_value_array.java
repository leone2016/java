package DSA_Dinesh_Varuani;

public class _27_find_secondMax_value_array {
    /**
     * - class 27
     * Q. Given an array of integers, return second maximum value in the array
     * Input: arr = { 12,34,2,34,33,1}
     * Output: 33
     */
    public static void main(String[] args) {
        int[] arr = { 12,34,2,34,33,1};
        int n = arr.length;
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
