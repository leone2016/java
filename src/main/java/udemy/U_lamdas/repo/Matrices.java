package udemy.U_lamdas.repo;

public class Matrices {

    public static void main(String[] args) {
        // Crear una matriz de enteros
        int[] edades = {25, 30, 22, 28, 35};

        // Recorrer la matriz e imprimir cada elemento
        System.out.println("Edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }

        // Crear una matriz bidimensional (tabla)
        String[][] empleados = {
                {"Juan", "Pérez", "Desarrollador"},
                {"María", "Gómez", "Diseñadora"},
                {"Pedro", "López", "Analista"}
        };

        // Acceder e imprimir información de un empleado
        System.out.println("\nInformación del empleado 2:");
        System.out.println("Nombre: " + empleados[1][0]);
    }
}