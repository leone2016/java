package certification8.OCA.Arrays;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr =new int[3];
        //initialize the array

        //declare and initialize at the same time
        int nums[] = {1,2,3,4, -5};
        nums = new int[]{1,2,3,4}; // DOES NOT COMPILE

        // there are more ways
        int[] numbers;
        int [] moreNumbers;
        int numberArray[];

        // not recommended
        int[] myArray, mySecondArray; // both are arrays
        int myThirdArray[], myFourthArray; // myThirdArray is an array, myFourthArray is an int

        //arrays don't implement equals method
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println("a.equals(b): "+a.equals(b));  // false
        //print out the array

        int[] c = {4,5,6};
        System.out.println("c: "+c); // prints the reference

        System.out.println("java.util.Arrays.toString(c): "+ java.util.Arrays.toString(c)); // prints the content

        //every arrya has a property called length, not a method
        System.out.println("c.length: "+c.length); // 3
        System.out.println("---------------------------------------------");
        System.out.println("Sorting, Searching, Comparing Arrays");
        System.out.println("NOTE: Arrays are mutale, sort() method changes the original array");
        // Arrays.sort()
        int[] d = {4,2,7,1,3,5,6};
        java.util.Arrays.sort(d);
        System.out.println("Sorted d: "+ java.util.Arrays.toString(d)); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(" Binary Search");
        System.out.println("""
                
                
                - Works only on sorted arrays
                - if arrays is not sorted, the result is unpredictable
                - takes array and arral element as arguments
                - if element is found, returns the index of the element
                - if element is not found, returns (-(insertion point) - 1)
                - insertion point is the index at which the element would need to be inserted to
                  maintain the sorted order
                - time complexity is O(log n)
                """);
        int[] e = {2,4,6,8,10};
        System.out.println("java.util.Arrays.binarySearch(e, 6): "+ java.util.Arrays.binarySearch(e, 6)); // 2
        System.out.println("java.util.Arrays.binarySearch(e, 1): "+ java.util.Arrays.binarySearch(e, 1)); // -1
        System.out.println("java.util.Arrays.binarySearch(e, 5): "+ java.util.Arrays.binarySearch(e, 5)); // -3

        System.out.println(" Binary Search on unsorted array");
        int[] f = {10,2,8,6,4};
        System.out.println("java.util.Arrays.binarySearch(f, 6): "+ java.util.Arrays.binarySearch(f, 6)); // unpredictable result
        System.out.println(" Comparing Arrays");
        System.out.println(" Comparing Arrays");
        System.out.println(" Comparing Arrays");
        System.out.println("""
                
                
                Arrays.compare()
                - determines which array is "smaller" and returns:
                - negative number if first array is smaller
                - positive number if first array is larger
                - zero if both arrays are equal
                - compares elements lexicographically
                - if all elements are equal, shorter array is considered smaller
                
                WHAT IS SMALLER ARRAY?
                - if one array has less number of elements, its smaller
                - if both arrays have same number of elements, compare element by element
                  until a difference is found
                - the array with the smaller element at the first point of difference is considered smaller
                - null is smaller than any other value
                - for Strings
                    - uppercase letters are smaller than lowercase letters
                    - one is smaller if it's a prefix of another
                    - numbers are smaller that letters
                    - alphabetical order is used
                - time complexity is O(n)
                """);
        System.out.println("Positive number: "+ Arrays.compare(new int[]{1,2,3}, new int[]{1,2})); // positive number
        System.out.println("Equals - Zero: "+ Arrays.compare(new int[]{1,2,3}, new int[]{1,2,3})); // 0
        System.out.println("Negative number:"+ Arrays.compare(new String[]{"ab", "John wayne"}, new String[]{"abc", "Hey!"})); // negative number
        System.out.println("Positive number: "+ Arrays.compare(new String[]{"xy", "John wayne"}, new String[]{"abc", "Hey!"})); // positive number;
        System.out.println("Negative number: "+ Arrays.compare(new String[]{"Apple", "John wayne"}, new String[]{"apple", "Hey!"})); //negative number
        System.out.println("Positive null: "+ Arrays.compare( new String[]{"apple", "Hey!"}, null)); // positive number

        System.out.println("""
                
                
                Arrays.mismatch()
                - returns the index of the first mismatched element between two arrays
                - returns -1 if both arrays are equal
                """);
        System.out.println("mismatch index: "+ Arrays.mismatch(new int[]{1,2,3}, new int[]{1,2,4})); // 2
        System.out.println("mismatch index: "+ Arrays.mismatch(new String[]{"apple", "banana"}, new String[]{"apple", "banana"})); // -1
        String[] arr1 = {"Jhown", "Jane"};
        String[] arr2 = {"Jhown", "Jane", "Jackson"};
        System.out.println("mismatch index: "+ Arrays.mismatch(arr1, arr2)); // 2

        System.out.println("---------------------------------------------");
        System.out.println("""
                
                
                
                MULTIDIMENSIONAL ARRAYS
                
                """);

        int[][] multi = {
                {-1,17},
                {3,5},
                {9,11,13},
                {4,9,-6,7}
        };

        System.out.println("multi.length: "+ multi.length); // 4
        System.out.println("multi[2].length: "+ multi[2].length); //
        System.out.println("Accessing element: multi[3][2]: "+ multi[3][2]); // -6
        for(int[] array : multi){
            System.out.println("Array: "+ Arrays.toString(array));

        }
        // access elements with for-each loop (no control over indices)
        for(int i=0; i< multi.length; i++){
            for(int j=0; j< multi[i].length; j++) {
                System.out.print(multi[i][j] + " ");
            }
        }







    }
}
