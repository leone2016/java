package leetCode;

/**
 * Para que ese subarreglo sea divisible por `k`, queremos que:
 *
 * (prefixSum[i]−prefixSum[j])mod k=0
 *
 * Y eso ocurre si:
 *
 * prefixSum[i] mod k = prefixSum[j] mod k
 * Entonces:
 * Si dos prefixSums tienen el mismo residuo al dividir por k, entonces el subarreglo entre ellos es divisible por k
 *
 * ¿Qué estructura usar?	HashMap (modulo → frecuencia)
 */
public class _974_SubArrayDivDyK {

    public static int subarraysDivByK(int[] nums, int k){
        int map[] = new int[k];   // map[mod] = count of prefix sums with that remainder
        map[0] = 1;               // base case: empty prefix sum
        int sum = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) rem += k;  // para que siempre esté entre [0, k-1]
            count += map[rem];      // sumar todas las veces que ya vimos este mismo mod
            map[rem]++;             // registrar este mod para futuras comparaciones
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5)); // 7
        System.out.println(subarraysDivByK(new int[]{5}, 9)); // 0
        System.out.println(subarraysDivByK(new int[]{4, 5, -10, -2, -3, 1}, 5)); // 7

    }
}
