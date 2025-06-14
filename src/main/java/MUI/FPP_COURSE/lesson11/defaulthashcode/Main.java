package MUI.FPP_COURSE.lesson11.defaulthashcode;

import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * REVIEWED
 */
public class Main {

	public static void main(String[] args) {
		Person p = new Person("Joe", "Smith", 100000, new GregorianCalendar(1988, 5, 5));
		System.out.println(p.toString());
		System.out.printf("TO HEX STRING: %h\n",Integer.toHexString(p.hashCode()));
		System.out.printf("HASHCODE: %d\n\n\n",p.hashCode());
		
		
		Person p1 = new Person("Joe", "Smith", 100000, new GregorianCalendar(1988, 5, 5));
		System.out.println(p1.toString());
		System.out.printf("TO HEX STRING: %h\n",Integer.toHexString(p1.hashCode()));
		System.out.printf("HASHCODE: %d\n",p1.hashCode());


	}

}
