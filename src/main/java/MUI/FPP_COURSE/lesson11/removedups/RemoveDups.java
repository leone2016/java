package MUI.FPP_COURSE.lesson11.removedups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
	ArrayList<String> list;
	public RemoveDups(ArrayList<String> list) {
		this.list = list;
	}
	
	public ArrayList<String> getUpdatedList() {
		return list;
	}
	
	public void removeSlowWay() {
		ArrayList<String> distinct = new ArrayList<String>();
		String next = null;
		distinct.add(list.get(0));
		for(int i = 1; i < list.size(); ++i) {
			next = list.get(i);
			boolean found = false;
			for(int j = 0; j < i; ++j) {
				if(next.equals(list.get(j))) {
					found = true;
					break;
				}
			}
			if(!found) distinct.add(next);
		}
		list = distinct;
		
	}
	public void removeFastWay() {
		ArrayList<String> distinct = new ArrayList<String>();
		HashMap<String, String> alreadyChecked = new HashMap<String, String>();
		String next = null;
		for(int i = 0; i < list.size(); ++i) {
			next = list.get(i);
			if(!alreadyChecked.containsKey(next)) {
				distinct.add(next);
				alreadyChecked.put(next, next);
			}
		}
		list = distinct;
	}
	public static void main(String[] args) {
		String[] distinctVals = {"boy", "car", "dog", "cat", "house"};
		ArrayList<String> testList = new ArrayList<String>();
		String next = null;
		for(int i = 0; i < 3500000; ++i) {
			next = distinctVals[RandomNumbers.getRandomInt(0,4)];
			testList.add(next);
		}
		System.out.println(testList);
		RemoveDups rd = new RemoveDups(testList);
		long begin = System.currentTimeMillis();
		rd.removeSlowWay();
		ArrayList<String> slowResult = rd.getUpdatedList();
		long end = System.currentTimeMillis();
		long slowTime = end - begin;
		
		rd = new RemoveDups(testList);
		begin = System.currentTimeMillis();
		rd.removeFastWay();
		ArrayList<String> fastResult = rd.getUpdatedList();
		end = System.currentTimeMillis();
		long fastTime = end - begin;
		System.out.println("Slow time: " + slowTime);
		System.out.println(slowResult);
		System.out.println("Fast time: " + fastTime);
		System.out.println(fastResult);
				
	}
}
