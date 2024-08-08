package udemy.lambdas_functional_programming.lambdaFunctionInterface;

import udemy.lambdas_functional_programming.entities.Person;
import udemy.lambdas_functional_programming.entities.PersonRepository;

import java.util.List;
import java.util.function.Supplier;

public class _23_SupplierExample {

    static Supplier<Person> s1 = ()->PersonRepository.getPerson();
    static Supplier<List<Person>> s2 = ()->PersonRepository.getAllPersons();
    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        System.out.printf("Get Person: "+s1.get());
        System.out.printf("Get People: "+s2.get());

    }
}
