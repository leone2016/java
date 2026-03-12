package interview;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private boolean active;

    public Employee(int id, String firstName, String lastName, String department, double salary, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.active = active;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof  Employee)) return false;

        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                active == employee.active &&
                Objects.equals(employee.firstName, firstName) &&
                Objects.equals(employee.lastName, lastName) &&
                Objects.equals(employee.department, department);

    }

    @Override
    public int hashCode() {
      return Objects.hash(id, firstName, lastName, department, salary, active)
    }
}
