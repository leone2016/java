package MUI.FPP_COURSE.lec12;

public class DEMO2MultipleCatch {
	public static void main(String[] args) {
		int A[]  = { 30, 20, 0, 0, 40 };
		String s = null;
		try {
//			s.length();//
			int c = A[0] / A[0];
			
			System.out.println("Division is " + c);
			System.out.println(A[10]);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Denominator should not be 0");
		}
		catch (ArrayIndexOutOfBoundsException e) { //sub
			System.out.println("Index is Invalid");
		}
		catch (IndexOutOfBoundsException e) { //super
			System.out.println("Index is Invalid super");
		} 		
		catch (Exception e) { //super
			System.out.println("Null pointer");
		}
		
		System.out.println("Bye");

	}

}
