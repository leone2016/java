package leetCode;
import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
       var result = new ArrayList<Integer>();
       int lenP = p.length();
       int lenS = s.length();

       int[] map = new int[26];
       // realiza un mapeo en un array de s y p (en base a len de p)
       for(int i = 0; i < lenP; i++){
           int test1 = p.charAt(i) ;
           int test2 ='a';
           map[p.charAt(i) - 'a']++; // find a index pos then increase +1 each time
           map[s.charAt(i) - 'a']--; // find a index pos then decrease +1 each time
       }
       // aqui evalua los primeros valores de acuerdo a len p -------- INICIA
       // ej: si len p es 3, evalua los primeros valores y es o no un anagram
       int diffCount = 0;

       for(int diff: map){
           if(diff > 0 ) diffCount++;
       }
       if(diffCount == 0)result.add(0); // los guarda aqui
        // aqui evalua los primeros valores de acuerdo a len p -------- FIN
        for(int i = 0, n = lenS-lenP; i < n; i++){
            if(++map[s.charAt(i)-'a'] == 1 ) diffCount++;
            if(--map[s.charAt(i+lenP)-'a'] == 0) diffCount--;
            if(diffCount==0) result.add(i+1);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
        System.out.println(findAnagrams("abab", "ab"));         // [0, 1, 2]
    }
}
