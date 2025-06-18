package MUI.FPP_COURSE.lesson8.comparator_example;

public class Employee  {
	private String name;
	private int salary;
	
	public Employee(String name,int aSalary) {
		this.name = name;
		salary = aSalary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return name + ": " + salary;
	}
}
