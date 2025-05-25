package leetCode.monotonicStack;
import java.util.Arrays;
public class _739_DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int j = -1, n = temperatures.length;
        int[] monotonicStack = new int[n], result = new int[n];

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (j >= 0 && temp > temperatures[monotonicStack[j]]) {
                int indexStack = monotonicStack[j];
                monotonicStack[j] = 0; // pop visual
                //int lastTemp = temperatures[indexStack];
                result[indexStack] = i - indexStack;
                j--;
            }
            monotonicStack[++j] = i;
        }

        return result;
    }

    public static void main(String[] args) {
        _739_DailyTemperatures dt = new _739_DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(
                new int[]{73, 74, 75, 71, 69, 72, 76, 73}
        ))); // [1, 1, 4, 2, 1, 1, 0, 0]

        System.out.println(Arrays.toString(dt.dailyTemperatures(
                new int[]{30, 40, 50, 60}
        ))); // [1, 1, 1, 0]

        System.out.println(Arrays.toString(dt.dailyTemperatures(
                new int[]{30, 60, 90}
        ))); // [1, 1, 0]
    }
}


