package MUI.Algo.practice5;

import java.util.Arrays;

public class QuickSortPractice {

    public static void main(String[] args) {
        int[] data = {8, 7, 6, 5, 4, 3, 2, 1, 9};
        System.out.println("Arreglo original: " + Arrays.toString(data));

        quicksort(data, 0, data.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(data));
    }

    private static void quicksort(int[] arr, int start, int stop) {
        // Caso base: si el sub-arreglo tiene 0 o 1 elemento, está ordenado.
        if (stop <= start) {
            return;
        }

        // Selección del pivote usando la mediana de tres
        int pivotPos = medianOfThree(arr, start, stop);
        swap(arr, pivotPos, stop);
        System.out.println("start: "+start +"stop:"+stop+"--> SWAP: " + Arrays.toString(arr));
        int pivot = arr[stop];
        int i = start;
        int j = stop - 1;

        // Bucle de particionamiento
        while (true) {
            // Mover el puntero i hacia adelante
            while (i <= j && arr[i] < pivot) {
                i++;
            }
            // Mover el puntero j hacia atrás
            while (i <= j && arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                System.out.println("start: "+start +"stop: "+stop+"--> SWAP: " + Arrays.toString(arr));
                i++;
                j--;
            } else {
                break;
            }
        }

        // Colocar el pivote en su posición final
        swap(arr, stop, i);
        System.out.println("start: "+start +"stop: "+stop+"--> SWAP: " + Arrays.toString(arr));
        // Llamadas recursivas para los sub-arreglos
        quicksort(arr, start, i - 1);
        quicksort(arr, i + 1, stop);
    }

    /**
     * Selecciona la mediana de los elementos en start, medio y stop.
     */
    private static int medianOfThree(int[] arr, int start, int stop) {
        int mid = (stop + start )/ 2;

        if (arr[start] > arr[mid]) {
            swap(arr, start, mid);
        }
        if (arr[start] > arr[stop]) {
            swap(arr, start, stop);
        }
        if (arr[mid] > arr[stop]) {
            swap(arr, mid, stop);
        }
        return mid;
    }

    /**
     * Función de utilidad para intercambiar elementos.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}