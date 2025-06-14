package MUI.FPP_COURSE.lec12;

public class DEMO3ExceptionPropagation1 {
	void m() {
			int data = 50 / 0;
			System.out.println(data);
	}

	void n() {	
			m();	
	}

	void p() {		
			n();		
	}

	public static void main(String args[]) {
		DEMO3ExceptionPropagation1 obj = new DEMO3ExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}
}
