package MUI.sample_test.TEST;

import java.util.HashMap;

/**
 * intadmis2@miu.edu
 */
public class excercice3 {
    public static void main(String[] args) {
        System.out.println(isSelfReferential(new int[]{1, 2, 1, 0})); // 1
        System.out.println(isSelfReferential(new int[]{2, 0, 0})); // 0
        System.out.println(isSelfReferential(new int[]{0})); // 0
        System.out.println(isSelfReferential(new int[]{1})); // 0
        System.out.println(isSelfReferential(new int[]{2, 0, 2, 0})); // 1
        System.out.println(isSelfReferential(new int[]{2, 1, 2, 0, 0})); // 1
        System.out.println(isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0})); // 1
        System.out.println(isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0})); // 1
        System.out.println(isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0})); // 1
        System.out.println(isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0})); // 1
    }
    public static int isSelfReferential(int[ ] a){
        int[] count = new int[a.length];

        for (int num : a) {
            if (num < a.length) {
                count[num]++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != count[i]) {
                return 0;
            }
        }

        return 1;
    }

//    public static int isSelfReferential(int[ ] a){
////        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int num=0;num<a.length;num++){
//            int times = a[num];
//            int verifyTimes=0;
////            map.put(i,  map.getOrDefault(a[i], 0) + 1);
//            for(int j=0;j<a.length;j++){
//                if(a[j] == num){
//                    verifyTimes++;
//                }
//            }
//
//        }
//    }
}
