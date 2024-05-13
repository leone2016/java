package DSA_Dinesh_Varuani.queue;
import java.util.LinkedList;
import java.util.Queue;
/*
n=5
1 = 1
10 = 2
11 = 3
100 = 4
101 = 5 => 1^2 --  0^1 --- 1^0 => 1x2^2 + 0x2^1 + 1x2^0 => 4 + 0 + 1 =  5


 */
public class GenerateBinaryNumber {
    /**
     * Q. Generate Binary Numbers from 1 to n using a Queue
     *
     * Example: n = 3
     * Output: 1 10 11
     *
     * Example: n = 5
     * Output: 1 10 11 100 101
     */
    public void generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 1; i <= n; i++) {
            String s1 = String.valueOf(queue.poll());
            System.out.println(s1);

            String s2 = s1;
            queue.offer(s1 + "0");
            queue.offer(s2 + "1");
        }
    }

    public static void main(String[] args) {
        GenerateBinaryNumber generateBinaryNumber = new GenerateBinaryNumber();
        generateBinaryNumber.generateBinaryNumbers(5);
    }

}
