package DSA_Dinesh_Varuani._1_arrays;

public class _32_missing_number_array {
    /**
      - class 32, 33
      Q. Given an array of n-1 distinct numbers in the range of 1 to n. Find the missing number in it
      Input: arr = { 2,4,2,8,6,3,7}
      Output: 5 // the missing number from range 1 to 8 is 5.

      Mathematical Approach
      The sum of the first n Natural numbers = 1 + 2 + 3 + 4 ...+n = n * (n+1)/2

      Example
       Input: arr = {1,2,3,5}
       range 1 to 5
       5(5+1)/2 = 15
       15 - 1 = 14
       14 - 2 = 12
       12 - 3 = 9
       9 - 5 =  4

       Output: 4
     */
    public static void main(String[] args) {
        _32_missing_number_array obj = new _32_missing_number_array();
        int[] arr = {1,3,6,8,2,4,7};
        int n = arr.length;
        int missing = obj.findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);
    }

    private int findMissingNumber(int[] arr, int n) {
        int total = (n+1) * (n+2) / 2;
        for(int i = 0; i<n; i++){
            total -= arr[i];
        }
        return total;
    }


    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
