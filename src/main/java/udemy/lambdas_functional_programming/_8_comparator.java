package udemy.lambdas_functional_programming;

import java.util.Comparator;

public class _8_comparator {
    public static void main(String[] args) {
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(" Comparator 1: "+ c1.compare(15, 25));

        //After
        Comparator<Integer> c2 = (Integer o1, Integer o2) -> o1.compareTo(o2);
        Comparator<Integer> c3 = Integer::compareTo;
        Comparator<Integer> c4= (o1, o2) -> o1.compareTo(o2);;
        System.out.println(" Comparator 2: "+ c2.compare(15, 25));
        System.out.println(" Comparator 3: "+ c3.compare(15, 15));
        System.out.println(" Comparator 4: "+ c4.compare(15, 1));

    }
}
