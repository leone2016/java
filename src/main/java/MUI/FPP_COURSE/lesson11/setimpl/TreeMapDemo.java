package MUI.FPP_COURSE.lesson11.setimpl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	   public static void main(String args[]) {
	      // Create a hash map
	      TreeMap<String, Double> tm = new TreeMap<String, Double>();
	      // Put elements to the map
	      tm.put("Zara", Double.valueOf(3434.34));
	      tm.put("Mahnaz", Double.valueOf(123.22));
	      tm.put("Ayan", Double.valueOf(1378.00));
	      tm.put("Daisy", Double.valueOf(99.22));
	      tm.put("Qadir", Double.valueOf(-19.08));
	      
	      System.out.println("Sorted TreeMap: " + tm);
	     
	      
	      System.out.println("Printing all the elements in the TreeMap...");
		  // Get a set of the entries
	      Set set = tm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Entry me = (Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	   }
	}