package udemy.lambdas_functional_programming;

import udemy.lambdas_functional_programming.entities.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class _20_FunctionPersonExample {
    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");
    // Function<TypeInputData, TypeOutputData>
    static Function<String, Integer> f1 = name -> name.length();
    static Function<List<Person>, Map<String, Double>> f2 = personList -> {
      Map<String, Double> map = new HashMap<>();
          personList.forEach(per ->{
              if(p1.and(p2).test(per))
                map.put(per.getName(), per.getSalary());
          });

      return map;
    };


    public static void main(String[] args) {
        System.out.println(f1.apply("Java Features"));
        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, Double> map = f2.apply(personList);
        System.out.println("Result :"+map);
    }
}
