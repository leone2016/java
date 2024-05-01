package pildoras.console;

public class _23_matrices_arrays_arreglos {
    /*
    * Matrices o arreglos, es una estructura de datos que almacena datos en filas
    *
    * int[] miMatriz = new int[5]; // Declaración de un arreglo de 5 elementos
    * miMatriz[0] = 5; // Asignación de un valor al primer elemento
    *
    * Alternativa
    * int[] miMatriz = {5, 38, 15, 92, 71}; // Declaración de un arreglo con valores
     */
    public static void main(String[] args) {
        int[] miMatriz = new int[5];
        miMatriz[0] = 5;
        miMatriz[1] = 38;
        miMatriz[2] = 15;
        miMatriz[3] = 92;
        miMatriz[4] = 71;

        System.out.println("Elemento 1: " + miMatriz[0]);
        System.out.println("Elemento 2: " + miMatriz[1]);
        System.out.println("Elemento 3: " + miMatriz[2]);
        System.out.println("Elemento 4: " + miMatriz[3]);
        System.out.println("Elemento 5: " + miMatriz[4]);

        System.out.println("ALTERNATIVA");
        // Declaración de un arreglo con valores
        int[] miMatriz2 = {5, 38, 15, 92, 71};
        System.out.println("Elemento 1: " + miMatriz2[0]);
        System.out.println("Elemento 2: " + miMatriz2[1]);
        System.out.println("Elemento 3: " + miMatriz2[2]);
        System.out.println("Elemento 4: " + miMatriz2[3]);
        System.out.println("Elemento 5: " + miMatriz2[4]);

        System.out.println("Recorriendo un arreglo con un bucle for");
        for(int i = 0; i < miMatriz2.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + miMatriz2[i]);
        }
        System.out.println("Recorriendo un arreglo con un bucle for each");
        for(int i : miMatriz2) {
            System.out.println("Elemento: " + i);
        }
    }
}
