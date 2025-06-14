package MUI.FPP_COURSE.lec12;

public class DEMO0_0 {

	public static void main(String[] args) {
		int a = 5, b = 0, c;
		try {
			c = a/0;		
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Bye");
	}

}
