package MUI.FPP_COURSE.lesson8.comparator_example;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()<e2.getSalary()) return -1;
		else if(e1.getSalary()>e2.getSalary()) return 1;
		else return 0;
	}
}




