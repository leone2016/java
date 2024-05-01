package udemy.U_lamdas;

import java.util.Comparator;
@FunctionalInterface
public interface  _5_TestInterface {

    /**
     * Functional interface
     *
     * A functional interface is a interface that contains only one abstract method
     * The can have only funtionality to exhibit.
     */
    public void add();
    default String sayHi(){
        return "HI leo";
    }
    static boolean isTrue(){
        return true;
    }

}
