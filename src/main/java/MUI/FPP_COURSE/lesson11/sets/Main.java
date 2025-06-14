package MUI.FPP_COURSE.lesson11.sets;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String[] test = {"Tom", "Bob", "Heath", "Rich","Tom"};
		
		Set<String> strings = new HashSet<>();
		for(String s: test) {
			strings.add(s);
		}
		
		Iterator<String> itr = strings.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		strings.forEach(e->System.out.println(e));
		
		System.out.println(strings);
		strings.remove("Tom");
		System.out.println(strings);
		
		var stringsInOrder = new TreeSet<>();
		for(String s: test) {
			stringsInOrder.add(s);
		}
		System.out.println(stringsInOrder);

	}

}
