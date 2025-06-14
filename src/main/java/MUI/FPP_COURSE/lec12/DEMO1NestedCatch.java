package MUI.FPP_COURSE.lec12;

public class DEMO1NestedCatch {

	public static void main(String[] args) {
		int A[] = { 30, 20, 10, 0, 40 };

		try {
			int c = A[0] / A[3];
			System.out.println("Division is " + c);

			try {
				System.out.println(A[8]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index is Invalid");
			}
			
			System.out.println("Hi hi");

		} catch (ArithmeticException e) {
			System.out.println("Denominator should not be 0");
		}

		System.out.println("Bye");
	}

}
