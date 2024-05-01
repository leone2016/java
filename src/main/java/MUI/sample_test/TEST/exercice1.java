package MUI.sample_test.TEST;

import java.util.HashMap;

public class exercice1 {
    public static void main(String[] args) {
        System.out.println(equivalentArrays(new int[]{0, 1, 2}, new int[]{2, 0, 1})); // 1
        System.out.println(equivalentArrays(new int[]{0, 1, 2, 1}, new int[]{2, 0, 1})); // 1
        System.out.println(equivalentArrays(new int[]{2, 0, 1}, new int[]{0, 1, 2, 1})); // 1
        System.out.println(equivalentArrays(new int[]{0, 5, 5, 5, 1, 2, 1}, new int[]{5, 2, 0, 1})); // 1
        System.out.println(equivalentArrays(new int[]{0, 2, 1, 2}, new int[]{3, 1, 2, 0})); // 0
        System.out.println(equivalentArrays(new int[]{3, 1, 2, 0}, new int[]{0, 2, 1, 0})); // 0
        System.out.println(equivalentArrays(new int[]{}, new int[]{3, 1, 1, 1, 1, 2})); // 0
        System.out.println(equivalentArrays(new int[]{}, new int[]{})); // 1
    }

    public static int equivalentArrays(int[] a1, int[]a2){
        HashMap<Integer, Integer> mapA1 = new HashMap<>();
        HashMap<Integer, Integer> mapA2 = new HashMap<>();

        for(int i=0;i<a1.length;i++){
            mapA1.put(a1[i], 0 );
        }
        for(int i=0;i<a2.length;i++){
            mapA2.put(a2[i], 0 );
        }

        if (mapA1.equals(mapA2)) {
            return 1;
        } else {
            return 0;
        }
    }
}
