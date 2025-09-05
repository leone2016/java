package MUI.Algo;

import java.util.Arrays;

public class practice3 {

    public static void main(String[] args) {
        int n = 5, start = 5;
        int [][] mat = genM2(n, start);
        print(mat);
        var test = searchSS(mat, 34);
        System.out.println("RESULT: " + test);
    }



    public static String searchSS(int[][] mat, int k){
        int n = mat[0].length;
        int i = 0;
        int j = n-1;
        if(mat[0][0]< k && mat[j][j] < k) return "Not Found, out of range";
        while(i < n && j >= 0 ){

            if(mat[i][j] == k){ return String.format("%d, %d", i,j); }
            if(mat[i][j] < k)
                i++;
            else
                j--;
        }
        return "Not Found";
    }

    public static int[][] genM2(int n, int start) {
        int[][] m = new int[n][n];
        int v = start;
        for (int s = 0; s <= 2 * n - 2; s++) {
            int rMin = Math.max(0, s - (n - 1));
            int rMax = Math.min(n - 1, s);
            if (s % 2 == 0) {
                // arriba -> abajo
                for (int i = rMin; i <= rMax; i++) {
                    int j = s - i;
                    m[i][j] = v++;
                }
            } else {
                // abajo -> arriba
                for (int i = rMax; i >= rMin; i--) {
                    int j = s - i;
                    m[i][j] = v++;
                }
            }
        }
        return m;
    }
    public static void print(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
        System.out.println();
    }

    public static int[] DACsearchSS(int[][] m, int key) {
        return dac(m, 0, 0, m.length - 1, m[0].length - 1, key);
    }

    private static int[] dac(int[][] a, int r1, int c1, int r2, int c2, int key) {
        if (r1 > r2 || c1 > c2) return null;
        var upper_left = a[r1][c1];
        var down_right = a[r2][c2];
        if (key < upper_left || key > down_right) return null;

        int cMid = (c1 + c2) / 2;

        // Binary search en la columna cMid
        int lo = r1, hi = r2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int midVal = a[mid][cMid];
            if (midVal== key) return new int[]{mid, cMid};
            if (midVal < key) lo = mid + 1;
            else hi = mid - 1;
        }
        int splitRow = lo; // primera fila con valor > key en cMid

        // Dos submatrices posibles:
        // 1) arriba-derecha
        int[] res = dac(a, r1, cMid + 1, splitRow - 1, c2, key);
        if (res != null) return res;

        // 2) abajo-izquierda
        return dac(a, splitRow, c1, r2, cMid - 1, key);
    }


}


