package MUI.FPP_COURSE.lesson12;

public class DEMO3ExceptionPropagation2 {
    void m() {
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("1. "+e);
        } finally {
            System.out.println("2. Finally m()");
        }
        System.out.println("3. m method bye");
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
        System.out.println("4. normal flow...");
    }
}
