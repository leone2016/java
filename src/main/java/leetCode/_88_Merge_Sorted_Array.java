package leetCode;

public class _88_Merge_Sorted_Array {


        public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;             // Último índice válido de nums1
        int j = n - 1;             // Último índice de nums2
        int k = m + n - 1;         // Última posición de nums1 (espacio disponible)

        // Rellenar desde el final
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Si quedan elementos en nums2 (nums1 ya está en su lugar)
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

        public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        // Salida esperada: 1 2 2 3 5 6
    }

}
