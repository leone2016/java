package udemy.lambdas_functional_programming;

import java.util.function.Consumer;

public class _10_ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con1 = (s)-> {System.out.println(s.toUpperCase());};
        con1.accept("java8");

        Consumer<String> con2 = (s)-> {System.out.println(s.toLowerCase());};
        con2.accept("java11");
        con1.andThen(con2).accept("Leonardo");


    }
}
