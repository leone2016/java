package udemy.lambdas_functional_programming;

import udemy.lambdas_functional_programming.entities.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _14_BiConsumerPerson4 {
    static void printPersonDetails(){
        BiConsumer<String, List<String>> personConsumer = (name, hobbies)-> System.out.println(name+" "+ hobbies);
        BiConsumer<String, Double> salaryConsumer = (name, salary)-> System.out.println(name+" "+ salary);
        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(person -> personConsumer.accept(person.getName(), person.getHobbies()));
        System.out.println("_______________________________________");
        personList.forEach(person ->{
            personConsumer.accept(person.getName(), person.getHobbies());
            salaryConsumer.accept(person.getName(), person.getSalary());
        });
    }
    public static void main(String[] args) {
printPersonDetails();
    }
}
