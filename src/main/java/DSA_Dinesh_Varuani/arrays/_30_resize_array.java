package DSA_Dinesh_Varuani.arrays;

public class _30_resize_array {
    /**
     * - class 30, 31
     * Q.
     */
    public static void main(String[] args) {
        int[] original = { 0, 1, 0, 4};

        _30_resize_array arrUtil = new _30_resize_array();
        arrUtil.printArray(original);
        System.out.println(" The size of the original array (BEFORE) "+ original.length);
        original = arrUtil.resize(original, 10);
        System.out.println(" The size of the original array (AFTER) "+ original.length);


    }
    public int[] resize(int [] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
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
