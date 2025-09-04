package MUI.Algo.gcd;

public class GCD_BRUTE_FORCE {
    public static int gcdBruteForce(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return  i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcdBruteForce(15, 25));
     }
}
