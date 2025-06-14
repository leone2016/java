package MUI.FPP_COURSE.lesson12;
/**
 * checked
 */
public class DEMO07CheckedUnchecked {

    static void fun1() {
        throw new LowBalanceException();
    }

    static void fun2() {
        fun1();
    }

    static void fun3() throws NegativeDimensionException {
        fun2();
        throw new NegativeDimensionException();
    }

    public static void main(String[] args) {
        try {
            fun3();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Normal flow ...");
    }
}
