package MUI.FPP_COURSE.lesson12;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * checked
 */
public class DEMO06CheckedException3 {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("C:\\demo\\file.txt");) {
            int m;
            while ((m = input.read()) != -1) {
                System.out.print((char) m);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
