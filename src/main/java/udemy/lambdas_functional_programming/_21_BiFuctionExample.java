package udemy.lambdas_functional_programming;

import udemy.lambdas_functional_programming.entities.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class _21_BiFuctionExample {
    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static BiFunction<String, String, String> bf1 = (a,b)-> (a+ " :: " + b);
    static BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> bf2 = (personList, predicate)->{

        Map<String, Double> map = new HashMap<>();
        personList.forEach(per ->{
            if(predicate.test(per))
                map.put(per.getName(), per.getSalary());
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println("Result :"+ bf1.apply("Java", "Features"));
        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, Double> map = bf2.apply(personList, p1.and(p2));
        System.out.println("Result :"+map);
    }
}
