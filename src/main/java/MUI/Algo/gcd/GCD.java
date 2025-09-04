package MUI.Algo.gcd;

/**
 * Greatest common factor
 */
public class GCD {

    static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
        System.out.println(gcd(13, 8));
        System.out.println(gcd(8,5));
        System.out.println(gcd(5,3));
        System.out.println(gcd(2,1));
        System.out.println(gcd(1,0));
    }
}
//