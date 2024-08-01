package DSA_Dinesh_Varuani._1_arrays;

import java.util.Arrays;
import java.util.Collections;

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
        int[] result = reverse(arr);
        printArray(result);
    }
    public static int[] reverse(int[] arr){
        int[] arrReturn = new int[arr.length];
        int end = arr.length -1;
        int start = 0;
        while (start < end){
            int temp = arr[end];
            arrReturn[end] = arr[start];
            arrReturn[start] = temp;
            start++;
            end --;
        }
        return arrReturn;
    }

    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(x-> System.out.print(x+" | "));
        System.out.println("");
    }
}
