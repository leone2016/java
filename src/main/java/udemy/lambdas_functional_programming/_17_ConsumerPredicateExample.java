package udemy.lambdas_functional_programming;

import udemy.lambdas_functional_programming.entities.Person;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _17_ConsumerPredicateExample {

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");
    static BiPredicate<Integer, String> p3 = (height, gender) -> height >= 140 && gender.equals("Male");
    static BiConsumer<String, List<String>> hobbiesConsumer = (name, hobbies)-> System.out.println(name+" "+ hobbies);

    //PREDICATE AND CONSUMER IN ONE
    static Consumer<Person> personConsumer = per->{
        if(p3.test(per.getHeight(), per.getGender())){
           hobbiesConsumer.accept(per.getName(),per.getHobbies());
        }
    };
    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(personConsumer);
    }
}
