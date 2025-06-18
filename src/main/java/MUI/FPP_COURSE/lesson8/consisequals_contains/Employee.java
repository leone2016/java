package MUI.FPP_COURSE.lesson8.consisequals_contains;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private Date hireDay;

	// constructor
	Employee(String aName, int aYear,
			int aMonth, int aDay) {
		name = aName;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	// needs to be improved!!
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.hireDay.equals(hireDay);
	}


	
	public static void main(String[] args) {
		Employee e = new Employee("Bob", 2000, 10, 2);
		String n = e.getName();
	}

}
