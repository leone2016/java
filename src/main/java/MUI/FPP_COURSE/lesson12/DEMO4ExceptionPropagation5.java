package MUI.FPP_COURSE.lesson12;

import java.io.IOException;
/**
 * checked
 */
public class DEMO4ExceptionPropagation5 {
	void m() throws IOException {		
		throw new IOException("device error");	
	}
	void n() throws IOException {
		m();//IOException
	}
	void p(){
		try {
			n();//IOException
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) {
		DEMO4ExceptionPropagation5 obj = new DEMO4ExceptionPropagation5();
		obj.p();
		System.out.println("normal flow");
	}
}
