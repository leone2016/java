package pildoras.console;

public class _25_Matrices_bidimencionales {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];//[filas][columnas]
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[0][3] = 40;
        matrix[0][4] = 50;

        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;
        matrix[1][3] = 70;
        matrix[1][4] = 80;

        matrix[2][0] = 70;
        matrix[2][1] = 80;
        matrix[2][2] = 90;
        matrix[2][3] = 100;
        matrix[2][4] = 110;

        matrix[3][0] = 100;
        matrix[3][1] = 110;
        matrix[3][2] = 120;
        matrix[3][3] = 130;
        matrix[3][4] = 140;

        for (int i = 0; i < matrix.length; i++) {//Recorremos las filas 4
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {//Recorremos las columnas 5
                System.out.print(matrix[i][j] + " ");
            }
        }


    }
}
