package MUI.FPP_COURSE.lesson12;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * checked
 */
public class DEMO06CheckedException1 {

    public static void main(String[] args) throws IOException {
        FileInputStream input1;
        input1 = new FileInputStream("C:\\demo\\file.txt");

        int m;
        while ((m = input1.read()) != -1) {
            System.out.print((char) m);
        }
        input1.close();


    }

}
