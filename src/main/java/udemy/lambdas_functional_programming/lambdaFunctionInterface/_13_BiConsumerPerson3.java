package udemy.lambdas_functional_programming.lambdaFunctionInterface;

import udemy.lambdas_functional_programming.entities.Person;
import udemy.lambdas_functional_programming.entities.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _13_BiConsumerPerson3 {
    static Consumer<Person> c1 = (p)-> System.out.println(p);

    static Consumer<Person> c2 = (p)-> System.out.print(p.getName().toUpperCase()+" -> ");
    static Consumer<Person> c3 = (p)-> System.out.println(p.getHobbies());
    static List<Person> people = PersonRepository.getAllPersons();


    public static void main(String[] args) {
        BiConsumer<Integer, Integer> con1 = (a,b)-> System.out.println("ADD: "+(a+b));
        BiConsumer<Integer, Integer> con2 = (a,b)-> System.out.println("Subs: "+(a-b));
        BiConsumer<Integer, Integer> con3 = (a,b)-> System.out.println("Mult: "+(a*b));
        con1.andThen(con2).andThen(con3).accept(10,30);

        List<Integer> list1 = Arrays.asList(new Integer(10),new Integer(23), new Integer(12));
        List<Integer> list2 = Arrays.asList(new Integer(10), new Integer(12));

        BiConsumer< List<Integer>,  List<Integer>> con5 = (l1,l2) -> {
            if(l1.size() == l2.size()) System.out.println("List1 and List2 are equals");
            else System.out.println("Listas no son iguales");
        };
        con5.accept(list1, list2);

    }
}
