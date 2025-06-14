package MUI.FPP_COURSE.lec12;

public class DEMO3ExceptionPropagation2 {
    void m() {
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally m()");
        }
        System.out.println("m method bye");
    }

    void n() {
        m();
    }

    void p() {
        n();
    }

    public static void main(String args[]) {
        DEMO3ExceptionPropagation2 obj = new DEMO3ExceptionPropagation2();
        obj.p();
        System.out.println("normal flow...");
    }
}
