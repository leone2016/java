package MUI.FPP_COURSE.lesson8.binarysearch;

/**
 * Searches for value in a sorted string
 *
 */
public class BinarySearchStr {
	
	public boolean binSearch(String s, char c) {
		if(s == null || s.isEmpty()) return false;
		if(s.length() == 1) return s.charAt(0) == c;
		int mid = s.length()/2;
		if(c == s.charAt(mid)) return true;
		if(c < s.charAt(mid)) return binSearch(s.substring(0, mid), c);
		return binSearch(s.substring(mid + 1), c);		
	}
	
	public static void main(String[] args) {
		BinarySearchStr bss = new BinarySearchStr();
		System.out.println(bss.binSearch("aeiouwxyz", 'w'));
		System.out.println(bss.binSearch("aeiouwxyz", 'v'));
	}
}
