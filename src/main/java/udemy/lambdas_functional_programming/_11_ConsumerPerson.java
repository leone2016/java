package udemy.lambdas_functional_programming;

import udemy.lambdas_functional_programming.entities.Person;

import java.util.List;
import java.util.function.Consumer;

public class _11_ConsumerPerson {
    static Consumer<Person> c1 = (p)-> System.out.println(p);
    static Consumer<Person> c2 = (p)-> System.out.println(p.getName().toUpperCase());
    static Consumer<Person> c3 = (p)-> System.out.println(p.getHobbies());

    static void printNameAndHobbies(){
        List<Person> people = PersonRepository.getAllPersons();
        people.forEach(c2.andThen(c3));
    }
    public static void main(String[] args) {
        c1.accept(PersonRepository.getPerson());
        c2.accept(PersonRepository.getPerson());
        c3.accept(PersonRepository.getPerson());
    }
}
