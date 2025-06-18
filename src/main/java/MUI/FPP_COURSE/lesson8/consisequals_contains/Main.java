package MUI.FPP_COURSE.lesson8.consisequals_contains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
		Employee[] empArray = { 
				new Employee("George", 1996, 11, 5),
				new Employee("Dave", 2000, 1, 3),
				new Employee("Richard", 2001, 2, 7) };
		
		List<Employee> empList = Arrays.asList(empArray);
	
		Comparator<Employee> nameComp = new NameComparator1();
		
		TreeSet<Employee> tree = new TreeSet<>(nameComp);
		tree.addAll(empList);
		
		Employee george = new Employee("George", 2000, 10, 18);
		
		System.out.println("Is george in the empList? " + empList.contains(george));
		System.out.println("Is george in the treeSet? " + tree.contains(george));

	}
}
