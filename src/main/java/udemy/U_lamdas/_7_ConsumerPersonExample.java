package udemy.U_lamdas;


import udemy.U_lamdas.repo.Person;
import udemy.U_lamdas.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class _7_ConsumerPersonExample {

    static Consumer<Person> c1 = (p)-> System.out.println(p);
    static Consumer<Person> c2 = (p)-> System.out.println(p.getName().toUpperCase());
    static Consumer<Person> c3 = (p)-> System.out.println(p.getHobbies());
    static List<Person> personList = PersonRepository.getAllPersons();

    static void printNameAndHobbies(){
        personList.forEach(c2.andThen(c1));
    }
    static void printWithCondition(){
        personList.forEach( (p)->{
                    if(p.getGender().equals("Male") && p.getHeight() >=140){
                        c2.andThen(c3).accept(p);
                    }
                }
        );
    }
    public static void main(String[] args) {

        c1.accept(PersonRepository.getPerson());
        c2.accept(PersonRepository.getPerson());
        c3.accept(PersonRepository.getPerson());

        System.out.println("\n\n-------------------SINGLE LINE");
        c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());

        System.out.println("\n\n-------------------FOREACH");
        printNameAndHobbies();

        System.out.println("\n\n-------------------printWithCondition");
        printWithCondition();
    }


}