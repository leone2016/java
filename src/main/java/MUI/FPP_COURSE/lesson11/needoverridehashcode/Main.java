package MUI.FPP_COURSE.lesson11.needoverridehashcode;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Main {

	
	public static void main(String[] args) {
		Person p1 = new Person("Joe", "Smith", 100000, new GregorianCalendar(1988, 5, 5));
		Person p2 = new Person("Anne", "Jones", 80000, new GregorianCalendar(1986, 3, 9));
		
		MyHashtable h = new MyHashtable();
		//HashMap h = new HashMap();
		Pair key1 = new Pair(p1.getFirstName(), p1.getLastName());
		Pair key2 = new Pair(p2.getFirstName(), p2.getLastName());
		
		h.put(key1, p1);
		h.put(key2, p2);
		Pair lookup = new Pair("Joe", "Smith");
		System.out.println(lookup.equals(key1)); // true
		System.out.println(h.get(lookup));
		System.out.println(h.containsKey(lookup));
		
		System.out.println(key1.hashCode());
		System.out.println(lookup.hashCode());
		
		
	}

}
