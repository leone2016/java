package MUI.FPP_COURSE.lesson12;
/**
 * checked
 */
public class DEMO3ExceptionPropagation3 {
        int m() {
        try {
            int data = 50 / 0;
            return data;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally m()");
            return 9;
        }
    }

    void n() {
        System.out.println(m());
    }

    void p() {
        n();
    }

    public static void main(String args[]) {
        DEMO3ExceptionPropagation3 obj = new DEMO3ExceptionPropagation3();
        obj.p();
        System.out.println("normal flow...");
    }
}
