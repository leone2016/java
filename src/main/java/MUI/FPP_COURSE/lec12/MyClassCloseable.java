package MUI.FPP_COURSE.lec12;

import java.io.Closeable;
import java.io.IOException;

public class MyClassCloseable implements Closeable {

    private int num = 5;

    public int getNum(){
        return num;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closeable close");
    }
}
