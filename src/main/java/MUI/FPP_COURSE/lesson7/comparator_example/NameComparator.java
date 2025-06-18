package MUI.FPP_COURSE.lesson7.comparator_example;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

