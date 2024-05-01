package udemy.U_lamdas;

import java.util.Locale;
import java.util.function.Consumer;

public class _6_ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con1 = (s)->{
            System.out.println(s.toUpperCase());
        };

        con1.accept("leonardo");
        //sin conchetes
        Consumer<String> con2 = (s)-> System.out.println(s.toLowerCase());
        con2.accept("Medina");

        con1.andThen(con2).accept("Leonardo Patricio Medina Encalada");

    }


}