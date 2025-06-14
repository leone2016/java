package MUI.FPP_COURSE.lesson12;
/**
 * checked
 */
public class DEMO3ExceptionPropagation4 {

	void m() {
		try {
			int data = 50 / 0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			throw new RuntimeException("Exception throwing in catch of m()");
		}
		finally {
			System.out.println("Finally m()");
			throw new RuntimeException("Exception throwing in finally of m()");

		}

	}

	void n() {	
			m();	
	}

	void p() {		
			n();		
	}

	public static void main(String args[]) {
		DEMO3ExceptionPropagation4 obj = new DEMO3ExceptionPropagation4();
		try{
			obj.p();
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + " Exception is handled in main");
		}
		finally {
			System.out.println("Finally in Main");
		}
		System.out.println("normal flow...");
	}
}
