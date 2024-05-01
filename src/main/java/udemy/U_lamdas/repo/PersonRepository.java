package udemy.U_lamdas.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("Jhon", 165, 2000, "Male", 2,Arrays.asList("Cricket", "Football"));
        Person p2 = new Person("Angel", 165, 2000, "Male", 2,Arrays.asList("Cricket", "Swimming"));
        Person p3 = new Person("Leo", 165, 2000, "Male", 2,Arrays.asList("Football", "Tennis"));
        Person p4 = new Person("Nancy", 165, 2000, "Female", 2,Arrays.asList("Driving", "Swimming"));
        Person p5 = new Person("Lore", 165, 2000, "Female", 2,Arrays.asList("Music", "Swimming"));
        Person p6 = new Person("Alan", 165, 2000, "Male", 2,Arrays.asList("Football", "Tennis"));
        return Arrays.asList(p1, p2, p3, p4, p5, p6);
    }

    public static Person getPerson(){
        return new Person("Jhon", 165, 2000, "Male", 2,Arrays.asList("Cricket", "Football"));
    }
}
