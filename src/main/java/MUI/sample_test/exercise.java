package MUI.sample_test;

import java.util.Arrays;

public class exercise {

    public static void main(String[] args) {
        int test = test1(new int[]{1, 2, 3});
        System.out.println( test);
    }

    /**
     * 0 (sin elemento central)
     * 1 (el elemento central N es estrictamente menor que todos los demás elementos)
     * @param a
     * @return
     */
    public static int   test1 (int[] a){
        boolean isEven = a.length %2 == 0;
        if(isEven) return 0;
        int middleIndex = a.length / 2;
        for(int i = 0;i<a.length;i++){
            if(i != middleIndex && a[middleIndex] >= a[i]){
                return 0;
            }
        }
        return  1;
    }
}
