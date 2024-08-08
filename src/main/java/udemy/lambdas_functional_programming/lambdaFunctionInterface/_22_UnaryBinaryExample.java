package udemy.lambdas_functional_programming.lambdaFunctionInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _22_UnaryBinaryExample {

    static UnaryOperator<String> uo1 = name -> name.toUpperCase();
    static UnaryOperator<Integer> uo2 = a -> a+10;
    static Comparator<Integer> comp = (a,b)-> a.compareTo(b);
    public static void main(String[] args) {

        System.out.println("Result 1: "+ uo1.apply("java8"));
        System.out.println("Result 2: "+ uo2.apply(10));
        BinaryOperator<Integer> bo1 = BinaryOperator.maxBy((a,b)-> (a>b) ? 1: (a==b)?0:-1);
        BinaryOperator<Integer> bo2 = BinaryOperator.maxBy(comp);
        BinaryOperator<Integer> bo3 = BinaryOperator.minBy(comp);
        System.out.println("Result 3 :" +bo1.apply(129, 22));
        System.out.println("Result 4 :" +bo2.apply(129, 22));
        System.out.println("Result 5 :" +bo3.apply(129, 22));
    }
}
