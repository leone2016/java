package MUI.FPP_COURSE.lec12;

import java.io.FileInputStream;
import java.io.IOException;

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
