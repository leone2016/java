package DSA_Dinesh_Varuani._1_arrays;

public class _21_remove_elements_array {
    /**
     * - class 21 22
     * Q. Given an array of integers, return an array with even integers removed
     * Input: arr = { 3,2,4,7,0,6,5,8}
     * Output: {3,7,5}
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 3,2,4,7,0,6,5,8};
        int n = arr.length;
        int j = 0;

        int[] odd = new int[n];

        for(int i= 0;i<n;i++){
            if(arr[i] % 2 != 0){
                odd[j] = arr[i];
                j++;
            }
        }
        for(int i= 0;i<j;i++){
            System.out.println(odd[i]);
        }
    }
}
