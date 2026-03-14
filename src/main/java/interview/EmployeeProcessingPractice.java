package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Q1: I have a list of 10K employee data. I want to perform some data transformation
 * and filtration, remove duplicates, and get data in sorted order. How do you handle
 * it?
 *
 * Answer:
 * When dealing with large datasets like 10K employees, the key is efficient processing without
 * consuming too much memory. In Java, the Streams API is perfect for transformation, filtering, and
 * sorting.
 *
 * 1. Filtering: Use filter() to select only the employees that match your criteria.
 * 2. Removing duplicates: Use distinct(), which internally relies on properly implemented equals()
 * and hashCode() in your Employee class.
 * 3. Sorting: Use sorted() with a Comparator.
 */
public class EmployeeProcessingPractice {
    public static void main(String[] args) {
        /**
         * - isActive
         * - salary > 50K
         * - "Engineering" or "Finance"
         * filtration
         *      - remove duplication
         *      - sorted order (Department, Salary (DESC), fullName (firstName , LastName)
         */
        List<Employee> employeeList = mockEmployees();
        List<EmployeeDTO> result = employeeList.stream()
                .distinct()
                .filter(Employee::isActive)
                .filter(e-> e.getSalary() > 50_000)
                .filter(e-> e.getDepartment().equals("Finance") || e.getDepartment().equals("Engineering"))
                .map(e-> new EmployeeDTO(
                        e.getId(),
                        e.getFirstName()+" "+e.getLastName(),
                        e.getDepartment(),
                        e.getSalary()))
                .sorted(Comparator
                        .comparing(EmployeeDTO::getDepartment)
                        .thenComparing(EmployeeDTO::getSalary, Comparator.reverseOrder())
                        .thenComparing(EmployeeDTO::geFullName))
                .toList();

        result.forEach(System.out::print);



    }

    private static List<Employee> mockEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Alice", "Johnson", "Engineering", 75000, true));
        employees.add(new Employee(2, "Bob", "Smith", "Finance", 68000, true));
        employees.add(new Employee(3, "Carol", "White", "HR", 52000, true));
        employees.add(new Employee(4, "David", "Brown", "Engineering", 48000, true));
        employees.add(new Employee(5, "Emma", "Davis", "Finance", 90000, false));
        employees.add(new Employee(6, "Frank", "Miller", "Engineering", 99000, true));
        employees.add(new Employee(7, "Grace", "Wilson", "Marketing", 61000, true));
        employees.add(new Employee(8, "Henry", "Moore", "Finance", 71000, true));
        employees.add(new Employee(9, "Ivy", "Taylor", "Engineering", 83000, true));
        employees.add(new Employee(10, "Jack", "Anderson", "Finance", 55000, true));

        // duplicates
        employees.add(new Employee(2, "Bob", "Smith", "Finance", 68000, true));
        employees.add(new Employee(6, "Frank", "Miller", "Engineering", 99000, true));
        employees.add(new Employee(9, "Ivy", "Taylor", "Engineering", 83000, true));

        return employees;
    }
}
