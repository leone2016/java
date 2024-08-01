package DSA_Dinesh_Varuani._1_arrays;

import java.util.Arrays;

public class _25_find_min_value_array {
    /**
     * - class 25, 26
     * Q. Given an array of integers, find minimum value in the array
     * Input: arr = { 2, 11, 5 ,10, 7, 8}
     * Output: 2
     */
    public static void main(String[] args) {
        int[] arr = {  11, 5 ,10, 7, 8, 2};
       /* int n = arr.length;
        int min = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }*/
        int min = minValue(arr);
        System.out.println(min);
    }

    public static int minValue(int[] arr){
        int value = Arrays
                .stream(arr)
                .min()
                .orElseThrow(()-> new RuntimeException("Array esta vacio perro"));
        return value;
    }
}
