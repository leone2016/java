package MUI.FPP_COURSE.lesson12;

import java.util.Scanner;
/**
 * checked
 */
public class DEMO5TryWithResource2 {

    public static void main(String[] args) throws Exception {

        try (var ex1 = new MyClassAutoCloseable(); var ex2 = new MyClassCloseable(); Scanner sc = new Scanner(System.in)) {
            System.out.println(ex1.getNum());
            System.out.println(ex2.getNum());

            System.out.println("Type something");
            System.out.println(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Catch: " + e);
        } finally {
            System.out.println("Finally");
        }

//		int n = ex1.getNum();
    }

}
