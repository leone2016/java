package MUI.FPP_COURSE.lesson12;
/**
 * checked
 */
public class FinallyReturn {

    public static int print() {
        try {
//			throw new Exception();
            return 3;
        } catch (Exception e) {
            return 7;
        } finally {
            return 5;
        }

    }

    public static void main(String[] args) {
        System.out.println(print());
    }
}
