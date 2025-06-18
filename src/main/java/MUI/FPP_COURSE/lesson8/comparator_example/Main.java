package MUI.FPP_COURSE.lesson8.comparator_example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee[] arr = {new Employee("Bob", 2000), 
				new Employee("Steve", 3000), 
				new Employee("Alice", 50000)};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new NameComparator());
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new SalaryComparator());
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, (e1, e2) -> e2.getName().compareTo(e1.getName()));
		System.out.println(Arrays.toString(arr));
	}
}
   ///////output:
   //[Bob: 2000, Steve: 3000, Alice: 50000]
   //[Alice: 50000, Bob: 2000, Steve: 3000]
   //[Bob: 2000, Steve: 3000, Alice: 50000]


