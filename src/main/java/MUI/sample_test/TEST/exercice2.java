package MUI.sample_test.TEST;

public class exercice2 {

    public static void main(String[] args) {
        // Test cases
        System.out.println(is235Array(new int[]{2, 3, 5, 7, 11})); // 1
        System.out.println(is235Array(new int[]{2, 3, 6, 7, 11})); // 0
        System.out.println(is235Array(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10})); // 0
        System.out.println(is235Array(new int[]{2, 4, 8, 16, 32})); // 1
        System.out.println(is235Array(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1})); // 1
        System.out.println(is235Array(new int[]{7, 11, 77, 49})); // 1
        System.out.println(is235Array(new int[]{2})); // 1
        System.out.println(is235Array(new int[]{})); // 1
        System.out.println(is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7})); // 1

    }

    public static int is235Array(int[] a) {
        int div2 = 0, div3 = 0, div5 = 0, divNone = 0;

        for (int value : a) {
            boolean isDivisible = false;

            if (value % 2 == 0) {
                div2++;
                isDivisible = true;
            }
            if (value % 3 == 0) {
                div3++;
                isDivisible = true;
            }
            if (value % 5 == 0) {
                div5++;
                isDivisible = true;
            }
            if (!isDivisible) {
                divNone++;
            }
        }

        if ( (div2 + div3 + div5 + divNone) == a.length) {
            return 1;
        } else {
            return 0;
        }
    }

}
