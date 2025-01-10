package leetCode;

import java.util.AbstractList;
import java.util.List;

public class _412_fizzBuzz {
    public static List<String> fizzBuzz(int n) {
            return new AbstractList<String>(){

                @Override
                public int size(){
                    return n;
                }

                @Override
                public String get(int i){
                    i++;
                    String values ="";
                    if (i % 3 == 0 && i % 5 == 0) {
                        values = "FizzBuzz";
                    } else if (i % 3 == 0) {
                        values = "Fizz";
                    } else if (i % 5 == 0) {
                        values = "Buzz";
                    } else {
                        values = String.valueOf(i);
                    }
                    return values;
                }
            };
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 15;
        List<String> output = fizzBuzz(n);

        for (String str : output) {
            System.out.println(str);
        }
    }

}
