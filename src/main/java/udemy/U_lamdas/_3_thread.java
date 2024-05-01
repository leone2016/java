package udemy.U_lamdas;

public class _3_thread {

    public static void main(String[] args) {
        // Before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };

        new Thread(t1).start();

        // AFTER J8
        Runnable t2 = ()-> System.out.println("Hello World T2");
        new Thread(t2).start();

        Runnable t3 = ()-> System.out.println("Hello World T3");
        new Thread(t3).start();


    }
}
