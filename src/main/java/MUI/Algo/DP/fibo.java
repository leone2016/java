package MUI.Algo.DP;

import java.util.HashMap;

public class fibo {
    public static void main(String[] args) {
        System.out.println(f(6, "init"));
        System.out.println("Memoization: "+ fiboTopButtomMemo(6, new HashMap<>()));
    }

    private static int f(int n, String side) {
        System.out.println(side);
        if (n == 0) return n;
        if (n == 1) return n;
        int izq = f(n - 1, "izq");
        int der = f(n - 2, "der");
        return izq + der;
    }

    private static int fiboTopButtomMemo(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) return n;
        if (n == 1) return n;

        if(!memo.containsKey(n))
           memo.put(n, (fiboTopButtomMemo(n - 1, memo)+fiboTopButtomMemo(n - 2, memo)));
        return memo.get(n);
    }
}
