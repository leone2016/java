package DSA_Dinesh_Varuani.arrays;

public class _28_move_zeros_array {
    /**
     * - class 28,29
     * Q. Given an array of integers, write a function to move all 0's to the end of it while maintaining
     * the relative order of the non-zero elements.
     * Input: arr = { 0, 1, 0, 4, 12}
     * Output: {1, 4, 12, 0, 0}
     */
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 4, 12, 56, 0 , 4};
        _28_move_zeros_array moveZerosArray = new _28_move_zeros_array();
        moveZerosArray.printArray(arr);
        moveZerosArray.move(arr);
    }

    public int[] move(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i]  =arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        printArray(arr);
        return arr;
    }
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
