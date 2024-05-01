package udemy.U_lamdas;

import java.util.Comparator;

public class _4_Comparator {

    public static void main(String[] args) {

        //Before
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Comparator 1: "+c1.compare(15, 15));

        //AFTER

        Comparator<Integer> c2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Comparator 2 "+ c2.compare(15, 16));
    }
}
