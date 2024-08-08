package udemy.lambdas_functional_programming.lambdaFunctionInterface;

import udemy.lambdas_functional_programming.entities.Person;
import udemy.lambdas_functional_programming.entities.PersonRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _15_PredicatePerson {

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");
    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        List<Person> personFiltered = personList.stream().filter(p1.and(p2)).collect(Collectors.toList());
        //alternative
        personList.forEach(person -> {
            if(p1.and(p2).test(person)){
                System.out.println(person);
            }
        });

        System.out.println("==================================================================");
        personFiltered.forEach(person -> System.out.println(person));
    }
}
