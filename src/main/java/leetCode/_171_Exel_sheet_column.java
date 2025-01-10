package leetCode;
import java.util.Map;
import java.util.HashMap;

public class _171_Exel_sheet_column {
    private static Map<String, Integer> initHomologation (){
        Map<String, Integer> homologation = new HashMap<>();
        homologation.put("A", 1);
        homologation.put("B", 2);
        homologation.put("C", 3);
        homologation.put("D", 4);
        homologation.put("E", 5);
        homologation.put("F", 6);
        homologation.put("G", 7);
        homologation.put("H", 8);
        homologation.put("I", 9);
        homologation.put("J", 10);
        homologation.put("K", 11);
        homologation.put("L", 12);
        homologation.put("M", 13);
        homologation.put("N", 14);
        homologation.put("O", 15);
        homologation.put("P", 16);
        homologation.put("Q", 17);
        homologation.put("R", 18);
        homologation.put("S", 19);
        homologation.put("T", 20);
        homologation.put("U", 21);
        homologation.put("V", 22);
        homologation.put("W", 23);
        homologation.put("X", 24);
        homologation.put("Y", 25);
        homologation.put("Z", 26);
        return homologation;
    }
    public static int titleToNumber(String columnTitle) {
//        Map<String, Integer> homologation = initHomologation();
//        char[] tokens = columnTitle.toCharArray();
//        int j = 0;
//        int acum = 0;
//        for(int i = (tokens.length-1); i>=0;i-- ){
//            String letter = String.valueOf(tokens[i]);
//            Integer value = homologation.get(letter);
//            acum += Math.pow(26, j)*value;
//            j++;
//        }
//
//        return 0;

        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            var test = (int)(columnTitle.charAt(i) - 'A' + 1);
            ans = ans * 26 + test;
        }
        return ans;
    }
    public static void main(String[] args) {
       // String test1 = "A";
        //int res1 = titleToNumber(test1);
        String test2 = "AAB";
        int res2 = titleToNumber(test2);
        String test3 = "ZY";
        int res3 = titleToNumber(test3);
        String test4 = "CA";
        int res4 = titleToNumber(test4);
        String test5 = "AAA";
        int res5 = titleToNumber(test5);
    }
}



//class Solution {
//    public int titleToNumber(String columnTitle) {
//        int ans = 0;
//        for (int i = 0; i < columnTitle.length(); i++) {
//            ans = ans * 26 + (int)(columnTitle.charAt(i) - 'A' + 1);
//        }
//        return ans;
//    }
//}
