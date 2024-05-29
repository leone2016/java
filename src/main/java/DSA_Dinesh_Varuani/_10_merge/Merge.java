package DSA_Dinesh_Varuani._10_merge;

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7};
        int[] arr2 = {3, 4, 9};

        int[] test = merge(arr1, arr2, arr1.length, arr2.length);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " | ");
        }
    }

    /**
     * class 142, 143
     * Merge two sorted arrays
     *
     * @return
     */
    public static int[] merge(int[] arr1, int[] arr2, int n, int m) {
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = arr1[i];
            i++;
            k++;

        }
        while (j < m) {
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }

    /**
     * class 145
     * Merge two sorted arrays
     * <p>
     * - Merge sort is a divede and conquer algorithm
     * - Divide and conquer recursively breaks down a problems into two or more sub-problems of the same or related type,
     * until these become simple enough to be solved directly. The solutions to the sub-problems are then combined
     * to give a solution to the original problem. - Wikipedia
     * <p>
     * - Divide - In this step the algorithm takes middle point of array and divide the array into 2 halves. The algorithm is
     * carried out recursively for half arrays, until there are no more half arrays to divide.
     * - Conquer - In this step starting from the bottom, we sort and merge the divide arrays and get the sorted array
     */
    public static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }


    public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int l = low; l <= high; l++) {
            arr[l] = temp[l];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }
    }

}