package MUI.FPP_COURSE.lesson8.demo.mystringlist;

import java.util.*;

/**This version inherits from AbstractList and also implements RandomAccess */

public class MyStringListInheritRandom extends AbstractList<String> implements RandomAccess {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringListInheritRandom() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public boolean add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size++] = s;
		return true;
	}

	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		for (String test : strArray) {
			if (test.equals(s))
				return true;
		}
		return false;
	}
	
	public String set(int pos, String s) {
		if (pos<0 || pos >= size) return null;
		String val = strArray[pos];
		strArray[pos] = s;
		return val;
	}

	public void insert(String s, int pos) {
		if (pos > size)
			return;
		if (pos >= strArray.length || size + 1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length + 1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;

		System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
		strArray = temp;
		++size;

	}

	public boolean remove(String s) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index, strArray.length
				- (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}


	public int size() {
		return size;
	}

	public static void main(String[] args) {
		var l = new MyStringListInheritRandom();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		
		
		//direct use of iterator
		var iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
		//implicit use of iterator with for each style
		for(String str : l) {
			System.out.println(str.toString());
		}
		
		//Optimal sorting with RandomAccess
		Collections.sort(l);
		System.out.println(l);
		
		//Collections will notice that this class implements RandomAccess
		int pos = Collections.binarySearch(l,"Mark");
		System.out.println("String 'Mark' was found at position " + pos);
		
		
		
		
		
	}
}
