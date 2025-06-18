package MUI.FPP_COURSE.lesson8.demo.mystringlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add(1);
		alist.add("Hello");
		
		ArrayList<Integer> alist1 = new ArrayList<>();
		alist1.add(1);
		alist1.add(0, 5);
		alist1.add(15);
		System.out.println(alist1);
		alist1.remove(Integer.valueOf(10));
//		System.out.println(alist1);
		alist1.remove(0);
		
		ArrayList<String> alist2 = new ArrayList<>();
		alist2.add("hi");
		alist2.add("yes");
		alist2.add("alo");
		alist2.remove(0);
		alist2.remove("hi");
//		System.out.println(alist1);
//		alist1.set(0, 122);
//		System.out.println(alist1);
		//System.out.println(alist1.contains(15));
		Collections.sort(alist1);
		System.out.println(Collections.binarySearch(alist1, 10));
		
		LinkedList<String> llist = new LinkedList<>();
		llist.add("hello");
		llist.add("yes");
		
		
		
		
	}

}
