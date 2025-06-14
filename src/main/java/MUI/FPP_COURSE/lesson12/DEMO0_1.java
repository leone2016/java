package MUI.FPP_COURSE.lesson12;

/**
 * checked
 */
public class DEMO0_1 {

	public static void main(String[] args) {
		int a = 5, b = 0, c;
		try {
			c = a/0;		
			System.out.println(c);
		}
		finally{
			System.out.println("finally");
		}
		
		System.out.println("Bye");
	}

}
