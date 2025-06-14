package MUI.FPP_COURSE.lesson12;

import java.io.IOException;
/**
 * checked
 */
public class DEMO08ThrowThrowsDemo {
	static int area(int l, int b) throws NegativeDimensionException {
		if (l < 0 || b < 0)
			throw new NegativeDimensionException("Negative value");
		return l * b;
	}

	static void meth1() throws NegativeDimensionException {
		System.out.println("Area is " + area(10, 5));
	}

	public static void main(String[] args) throws NegativeDimensionException  {
		try {
			meth1();
			throw new IOException();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("pls re-enter positive numbers");
	}
}
