package udemy.lambdas_functional_programming;

import java.util.Comparator;

public class _24_MethodReference {

    // Classname :: methodNane
    public static void main(String[] args) {
        int test = _24_MethodReference.compare(10,20);
        System.out.println("Result :"+test);
        Comparator<Integer> comparator = _24_MethodReference::compare;
        System.out.println("Result 2:"+comparator.compare(20,20));

    }
    public static int compare(Integer x, Integer y){
        return Integer.compare(x,y);
    }

}
