package leetCode.divideAndConquer;
import java.util.*;

public class TopKFrequent {

        public int[] topKFrequent(int[] nums, int k) {
            // Step 1: Frequency Map
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : nums)
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            // Step 2: Unique elements array
            List<Integer> unique = new ArrayList<>(freqMap.keySet());

            // Step 3: QuickSelect to partition top K
            quickSelect(unique, 0, unique.size() - 1, freqMap, unique.size() - k);

            // Step 4: Collect top K
            int[] result = new int[k];
            for (int i = 0; i < k; i++)
                result[i] = unique.get(unique.size() - k + i);
            return result;
        }

        // QuickSelect function
        private void quickSelect(List<Integer> unique, int left, int right, Map<Integer, Integer> freqMap, int kSmallest) {
            if (left >= right) return;

            Random rand = new Random();
            int pivotIndex = left + rand.nextInt(right - left + 1);
            pivotIndex = partition(unique, left, right, pivotIndex, freqMap);

            if (pivotIndex == kSmallest)
                return;
            else if (pivotIndex < kSmallest)
                quickSelect(unique, pivotIndex + 1, right, freqMap, kSmallest);
            else
                quickSelect(unique, left, pivotIndex - 1, freqMap, kSmallest);
        }

        // Partition the array
        private int partition(List<Integer> unique, int left, int right, int pivotIndex, Map<Integer, Integer> freqMap) {
            int pivotFreq = freqMap.get(unique.get(pivotIndex));
            Collections.swap(unique, pivotIndex, right);
            int storeIndex = left;

            for (int i = left; i < right; i++) {
                if (freqMap.get(unique.get(i)) < pivotFreq) {
                    Collections.swap(unique, storeIndex, i);
                    storeIndex++;
                }
            }
            Collections.swap(unique, storeIndex, right);
            return storeIndex;
        }



}


class Main {
    public static void main(String[] args) {
        TopKFrequent solution = new TopKFrequent();

        int[] nums1= {1, 2, 2, 3, 3, 4};
        int k1 = 3;
        int[] result1 = solution.topKFrequent(nums1, k1);
        System.out.println("Top " + k1 + " frequent elements: " + java.util.Arrays.toString(result1));
//  int[] nums1 = {1, 1, 1, 2, 2, 3};
//        int k1 = 2;
//        int[] result1 = solution.topKFrequent(nums1, k1);
//        System.out.println("Top " + k1 + " frequent elements: " + java.util.Arrays.toString(result1));

        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = solution.topKFrequent(nums2, k2);
        System.out.println("Top " + k2 + " frequent elements: " + java.util.Arrays.toString(result2));
    }
}
