package udemy.lambdas_functional_programming;

import java.util.function.Function;

public class _19_FunctionExample {
    // Function<TypeInputData, TypeOutputData>
    static Function<String, String> f1 = name->name.toUpperCase().concat("s");
    static Function<String, String> f2 = name->name.toUpperCase().concat("_Features");
    public static void main(String[] args) {
        System.out.println("Result :"+ f1.apply("java"));
        System.out.println("Result :"+ f2.apply("java"));

        //primero se ejecuta f1 y esa data se la pasa a f2
        System.out.println("AndThen :"+f1.andThen(f2).apply("javaScript"));
        // primero se ejecuta f2 y esa data se la pasa a f1
        System.out.println("Compose :"+f1.compose(f2).apply("golang"));
    }
}
