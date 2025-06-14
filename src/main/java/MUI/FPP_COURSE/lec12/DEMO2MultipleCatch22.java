package MUI.FPP_COURSE.lec12;

public class DEMO2MultipleCatch22 {
	public static void main(String[] args) {
		int A[]  = { 30, 20, 0, 0, 40 };
		String s = null;
		try {
//			s.length();//
			int c = A[0] / A[0];
			System.out.println("Division is " + c);
			System.out.println(A[10]);
			
		}catch (ArithmeticException | IndexOutOfBoundsException| NullPointerException e) {
			System.out.println("error");
		} 
		catch (Exception e) {
			System.out.println("error");
		}
		System.out.println("Bye");

	}

}
