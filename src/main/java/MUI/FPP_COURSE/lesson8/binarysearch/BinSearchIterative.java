package MUI.FPP_COURSE.lesson8.binarysearch;

/**
 * Performs binary search on a sorted array using
 * an iterative approach
 */
public class BinSearchIterative {

	public static boolean binSearchIt(int[] arr, int x) {
		if(arr == null || arr.length == 0) return false;
		int lower = 0;
		int upper = arr.length -1;
		while(true) {
			if(lower > upper) return false;
			int mid = (lower + upper)/2;
			if(x == arr[mid]) return true;
			if(x < arr[mid]) { //search left
				upper = mid - 1; 
			} else {   //x > arr[mid], search right
				lower = mid + 1;  
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 8, 11, 23};
		int x1 = 11;
		int x2 = 4;
		System.out.println(binSearchIt(arr, x1));
		System.out.println(binSearchIt(arr, x2));
	}
	
	
}
