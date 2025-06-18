package MUI.FPP_COURSE.lesson8.demo.equalsexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", true));
		dogs.add(new Dog("Fifi", false));
		dogs.add(new DogCounter("Bobo", true));
		
		Dog d1 = new Dog("Fido", true);
		System.out.println("Is Fido in the list? " + dogs.contains(d1));
		Dog d2 = new Dog("Bobo", true);
		System.out.println("Is Bobo in the list? " + dogs.contains(d2));

		//Is Fido in the list? true
		//Is Bobo in the list? false

	}

}
