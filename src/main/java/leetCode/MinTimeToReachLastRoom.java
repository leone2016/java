package leetCode;

import java.util.*;
/*
3341. Find Minimum Time to Reach Last Room I

There is a dungeon with n x m rooms arranged as a grid.

You are given a 2D array moveTime of size n x m, where moveTime[i][j] represents the minimum time in
seconds when you can start moving to that room. You start from the room (0, 0) at time t = 0 and can move
 to an adjacent room. Moving between adjacent rooms takes exactly one second.

Return the minimum time to reach the room (n - 1, m - 1).

Two rooms are adjacent if they share a common wall, either horizontally or vertically.



Example 1:

Input: moveTime = [[0,4],[4,4]]

Output: 6

Explanation:

The minimum time required is 6 seconds.

At time t == 4, move from room (0, 0) to room (1, 0) in one second.
At time t == 5, move from room (1, 0) to room (1, 1) in one second.
Example 2:

Input: moveTime = [[0,0,0],[0,0,0]]

Output: 3

Explanation:

The minimum time required is 3 seconds.

At time t == 0, move from room (0, 0) to room (1, 0) in one second.
At time t == 1, move from room (1, 0) to room (1, 1) in one second.
At time t == 2, move from room (1, 1) to room (1, 2) in one second.
Example 3:

Input: moveTime = [[0,1],[1,2]]

Output: 3


 */
public class MinTimeToReachLastRoom {
    static class State implements Comparable<State> {
        int time;
        int x;
        int y;

        State(int time, int x, int y) {
            this.time = time;
            this.x = x;
            this.y = y;
        }

        public int compareTo(State other) {
            return Integer.compare(this.time, other.time);
        }
    }
    public static int minimumTime(int[][] moveTime) {
        int n = moveTime.length;//row
        int m = moveTime[0].length;//col

        int[][] minTime = new int[n][m];
        for (int[] row : minTime) Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<State> pq = new PriorityQueue<>();
        pq.offer(new State(0, 0, 0));
        minTime[0][0] = 0;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};// derecha, abajo, izquierda, arriba.

        while (!pq.isEmpty()) {
            State curr = pq.poll();

            if (curr.x == n - 1 && curr.y == m - 1) return curr.time;//result

            for (int[] d : dirs) {
                int nx = curr.x + d[0];
                int ny = curr.y + d[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    int currentTime = curr.time;
                    // Esperar si no se puede entrar aún
                    int sum = (nx+ny)%2==0?2:1;
                    if (currentTime < moveTime[nx][ny]) {
                        currentTime = moveTime[nx][ny] +sum;
                    }else{
                        currentTime += (nx+ny%2==0)?2:1;
                    }

                    if (currentTime < minTime[nx][ny]) {
                        minTime[nx][ny] = currentTime;
                        pq.offer(new State(currentTime, nx, ny));
                    }
                }
            }
        }
        return minTime[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int[][] moveTime1 = {{0,58},{27,69}};
        System.out.println(minimumTime(moveTime1)); // Output: 6

        int[][] moveTime2 = {{0,0,0},{0,0,0}};
        System.out.println(minimumTime(moveTime2)); // Output: 3

        int[][] moveTime3 = {{0,1},{1,2}};
        System.out.println(minimumTime(moveTime3)); // Output: 3
       /* PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            pq.add(i);
        }
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.size());*/
    }
}
