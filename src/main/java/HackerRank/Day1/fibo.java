package HackerRank.Day1;

public class fibo {
    public static void main(String[] args) {
        int n = 10;
        int prev = 0;
        int fibo = 1;
        for (int i = 0; i < n-1; i++) {
            int temp = fibo;
            fibo = fibo + prev;
            prev = temp;
            System.out.println(fibo);

        }
    }

}
