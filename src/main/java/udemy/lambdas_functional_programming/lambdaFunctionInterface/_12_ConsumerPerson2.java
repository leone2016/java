package udemy.lambdas_functional_programming.lambdaFunctionInterface;

import udemy.lambdas_functional_programming.entities.Person;
import udemy.lambdas_functional_programming.entities.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class _12_ConsumerPerson2 {
    static Consumer<Person> c1 = (p)-> System.out.println(p);
    static Consumer<Person> c2 = (p)-> System.out.print(p.getName().toUpperCase()+" -> ");
    static Consumer<Person> c3 = (p)-> System.out.println(p.getHobbies());
    static List<Person> people = PersonRepository.getAllPersons();

    static void printNameAndHobbies(){
        people.forEach(c2.andThen(c3));
    }
    static void printWithCondition(){
        System.out.println("\nPrintWithCondition ======================");
        people.forEach((p)-> {
           if(p.getGender().equals("Woman") && p.getHeight() >= 140)
               c2.andThen(c3).accept(p);
        });
    }
    public static void main(String[] args) {
        printNameAndHobbies();
        printWithCondition();
    }
}
