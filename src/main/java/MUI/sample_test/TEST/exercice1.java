package MUI.sample_test.TEST;

import java.util.HashMap;

/**
 *  Write a function named equivalentArrays that has two array arguments and returns 1 if the two arrays contain the
 *  same values (but not necessarily in the same order), otherwise it returns 0. Your solution must not sort either
 *  array or a copy of either array! Also you must not modify either array, i.e., the values in the arrays upon return
 *  from the function must be the same as when the function was called. Note that the arrays do not have to have the
 *  same number of elements, they just have to have one of more copies of the same values.
 *
 * If you are programming in Java, the function prototype is int equivalentArrays(int[ ] a1, int[ ] a2)
 *
 * Hint: If your solution compares the length of the first array with the length of the second array or vice versa,
 * you have misunderstood the problem!! Your solution does not need to determine which array is bigger!
 *
 * Examples:
 *
 * if a1 is	and a2 is	return
 * {0, 1, 2}	    {2, 0, 1}	1 (because both arrays contain the values 0, 1, 2)
 * {0, 1, 2, 1}    {2, 0, 1}	1 (because both arrays contain the values 0, 1, 2)
 * {2, 0, 1}    {0, 1, 2, 1}	1 (because both arrays contain the values 0, 1, 2)
 * {0, 5, 5, 5, 1, 2, 1}    {5, 2, 0, 1}	1 (because both arrays contain the values 0, 1, 2, 5)
 * {5, 2, 0, 1}    {0, 5, 5, 5, 1, 2, 1}	1 (because both arrays contain the values 0, 1, 2, 5)
 * {0, 2, 1, 2}    {3, 1, 2, 0}	0 (the value 3 is not in the first array)
 * {3, 1, 2, 0}    {0, 2, 1, 0}	0 (the value 3 is not in the second array)
 * {1, 1, 1, 1, 1, 1}    {1, 1, 1, 1, 1, 2}	0 (the value 2 is not in the first array)
 * {}    {3, 1, 1, 1, 1, 2}	0 (3 is not in the first array.)
 * {}    {}	1 (not possible to find a counterexample)
 */
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
