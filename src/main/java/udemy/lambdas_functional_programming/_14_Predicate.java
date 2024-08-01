package udemy.lambdas_functional_programming;

import java.util.function.Predicate;

public class _14_Predicate {

    public static void main(String[] args) {
        Predicate<Integer> lessThan = a -> (a <= 50);
        Predicate<Integer> greaterThan = a -> (a >= 50);
        Predicate<Integer> equalThan = a -> (a == 0);

        System.out.println("Result lessThat :"+lessThan.test(12));
        System.out.println("Result greaterThan :"+greaterThan.test(12));
        System.out.println("Result equalThan :"+equalThan.test(12));

        boolean result = lessThan.and(greaterThan).and(equalThan).test(150);
        System.out.println("Result :"+result);

        boolean result2 = lessThan.or(greaterThan).test(150);
        System.out.println("Result2 :"+result2);
        boolean result3 = lessThan.or(greaterThan).negate().test(150);
        System.out.println("!Result2 :"+result3);
    }
}
