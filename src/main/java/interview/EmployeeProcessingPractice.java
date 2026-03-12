package interview;

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

    }

}
