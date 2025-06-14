package MUI.FPP_COURSE.lec12;

public class DEMO0ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = {5,0,5};
		try {
			arr[5] = 0;
			System.out.println("This is test ");
		} catch (Exception e) {
			try {
				int i = 5/0;
			}
			catch(ArithmeticException e1) {
				System.out.println(e1);
			}
			finally {
				System.out.println("inner Finally");
			}

			System.out.println("Denominator should not be 0, try again");
		}
		finally {
			System.out.println("Finally");
		}

		System.out.println("Bye");
		

	}

}

