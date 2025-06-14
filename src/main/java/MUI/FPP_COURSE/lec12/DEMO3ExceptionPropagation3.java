package MUI.FPP_COURSE.lec12;

public class DEMO3ExceptionPropagation3 {
    int m() {
        try {
            int data = 50 / 10;
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
