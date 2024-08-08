package udemy.lambdas_functional_programming;


import udemy.lambdas_functional_programming.entities.Person;
import udemy.lambdas_functional_programming.entities.PersonRepository;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class _25_MethodReferenceExample1 {
    static Function<String, String> f1 = name -> name.toUpperCase();
    static Function<String, String> f2 = String::toUpperCase;
    static Predicate<Person> p1 = person -> person.getHeight() >= 140;
    static Predicate<Person> p2 = _25_MethodReferenceExample1::heightCheck;
    static BiPredicate<Person, Integer> p3= _25_MethodReferenceExample1::heightCheckParam;

    public static void main(String[] args) {

        System.out.println("Lambda Expression Result: "+f1.apply("java 8"));
        System.out.println("Lambda Expression Result2: "+f2.apply("java 8"));
        System.out.println("Predicate: "+p1.test(PersonRepository.getPerson()));
        System.out.println("Predicate 2: "+p2.test(PersonRepository.getPerson()));
        System.out.println("Predicate 3: "+p3.test(PersonRepository.getPerson(), 166));
    }

    static boolean heightCheck(Person person){
        return person.getHeight() >= 140;
    }
    static boolean heightCheckParam(Person person, Integer height){
        return person.getHeight() >= height;
    }
}
