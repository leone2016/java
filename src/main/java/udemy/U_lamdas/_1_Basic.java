package udemy.U_lamdas;

import java.util.stream.IntStream;

public class _1_Basic {

    public static void main(String[] args) {
        // before java 8

        int total = 0;
        for(int i=0; i<=50; i++) {
            total += i;
        }
        System.out.println("Total: " + total);
        System.out.println("AFTER java 8");
        int total2 = IntStream.rangeClosed(0,50)
                .map(Integer :: new)
                .sum();

        System.out.println("Total2: " + total2);
    }
}
