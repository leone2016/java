package MUI.Algo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class practice2 {

    public static void algo1(int []arr){
        int idxFirstMax = 0;
        int idxSecondMax = 0;
        int idxThirdMax = 0;
        for(int i=0;i<arr.length;i++){
            if( arr[idxFirstMax] < arr[i]){
                idxFirstMax = i;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(idxFirstMax != i  && arr[idxSecondMax] < arr[i] ){
                idxSecondMax = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(idxSecondMax != i  &&  idxFirstMax != i  && arr[idxThirdMax] < arr[i] ){
                idxThirdMax = i;
            }
        }
    }

    public static void algo2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        int prePreMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > max) {
                prePreMax = preMax;
                preMax = max;
                max = num;
            } else if (num > preMax && num != max) {
                prePreMax = preMax;
                preMax = num;
            } else if (num > prePreMax && num != max && num != preMax) {
                prePreMax = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + preMax);
        System.out.println("Third Max: " + prePreMax);
    }

    public static void algo3(int[] arr) {
        TreeMap<Integer, Boolean> map = new TreeMap<>();

        for (int num : arr) {
            map.put(num, true); // value is dummy
        }

        List<Integer> keys = new ArrayList<>(map.descendingKeySet());

        if (keys.size() >= 3) {
            System.out.println("Max: " + keys.get(0));
            System.out.println("Second Max: " + keys.get(1));
            System.out.println("Third Max: " + keys.get(2));
        } else {
            System.out.println("Not enough distinct elements!");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 20, 18, 4, 20, 19, 20, 3};
        algo1(arr);
    }
}
