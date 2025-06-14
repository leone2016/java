package MUI.FPP_COURSE.lec12;

public class MyClassAutoCloseable implements AutoCloseable{
    private int num = 5;

    public int getNum(){
        return num;
    }

    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseable close");
    }


}
