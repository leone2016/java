package udemy.lambdas_functional_programming;

public class _7_runnable_basic {
    public static void main(String[] args) {
        //before
       Runnable t1 = new Runnable() {
           @Override
           public void run() {
               System.out.println("Thread 1");
           }
       };
       //after
        Runnable t2 = ()-> System.out.println("Thread 2");
        Runnable t3 = ()-> System.out.println("Thread 3");

       new Thread(t1).start();
       new Thread(t2).start();
       new Thread(t3).start();
       new Thread(()-> System.out.println("Thread 4")).start();
       new Thread(()-> {
           System.out.println("Thread 5");
           System.out.println("Thread 6");
       }).start();
    }

}