package leetCode.greedy;

import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) {
            return 0;
        }

        // Count the frequency of each task.
        Map<Character, Integer> taskCounts = new HashMap<>();
        for (char task : tasks) {
            taskCounts.put(task, taskCounts.getOrDefault(task, 0) + 1);
        }

        // Find the maximum frequency.
        int maxCount = 0;
        for (int count : taskCounts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // Count the number of tasks with maximum frequency.
        int maxCountTasks = 0;
        for (int count : taskCounts.values()) {
            if (count == maxCount) {
                maxCountTasks++;
            }
        }

        // Calculate the minimum intervals needed.
        int intervals = (maxCount - 1) * (n + 1) + maxCountTasks;

        // Return the maximum of intervals and tasks.length
        return Math.max(intervals, tasks.length);
    }

    public static void main(String[] args) {
        TaskScheduler solution = new TaskScheduler();

        // Example 1
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n1 = 2;
        System.out.println("Example 1: " + solution.leastInterval(tasks1, n1)); // Output: 8

        // Example 2
        char[] tasks2 = {'A', 'C', 'A', 'B', 'D', 'B'};
        int n2 = 1;
        System.out.println("Example 2: " + solution.leastInterval(tasks2, n2)); // Output: 6

        // Example 3
        char[] tasks3 = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n3 = 3;
        System.out.println("Example 3: " + solution.leastInterval(tasks3, n3)); // Output: 10
    }
}
