package DSA_Dinesh_Varuani.matrix;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        searchInMatrix(matrix, 29);
        System.out.println(spiralArray(matrix));
    }

    /**
     * class 117(Explained in the class)
     * Q. Given a row and column wise (nxm) sorted matrix.
     * Write a program to search a key in a given matrix.
     */
    public static void searchInMatrix(int[][] matrix, int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == key) {
                System.out.println("Key found at: " + i + " " + j);
                return;
            }
            if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Key not found");
    }

    /**
     * class 119
     *
     * Print a given matrix in spiral form
     * Example
     * Input:
     * 1    2   3    4
     * 5    6   7    8
     * 9    10  11   12
     * 13    14 15   16
     *
     * Output:
     * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     */
    public static String spiralArray(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        StringBuilder result = new StringBuilder();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.append(matrix[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left] + " ");
                }
                left++;
            }
        }
        return result.toString();
    }

}
