package MUI.sample_test.Interview;

/* Write a method that raises a number to power without using Math.pow() method*/
public class PowNumber{
    public static void main(String[] args){
        System.out.println("2^3: "+ power(2, 3));
        System.out.println("4^6: "+ power(4, 6));
        System.out.println("6^6: "+ power(6, 0));
    }

    private static int power(int base, int expo){
        int result = 1; // 2
       // expo  = Math.abs(expo);
        for(int i=0;i<expo; i++){
            result = result * base;
        }
        return result;
    }

}