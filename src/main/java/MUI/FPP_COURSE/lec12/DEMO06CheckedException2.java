package MUI.FPP_COURSE.lec12;

import java.io.FileInputStream;
import java.io.IOException;

public class DEMO06CheckedException2 {
    public static void main(String[] args) {
        FileInputStream input1 = null;
        try {
            input1 = new FileInputStream("C:\\demo\\file.txt");

            int m;
            while ((m = input1.read()) != -1) {
                System.out.print((char) m);
            }
            input1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
