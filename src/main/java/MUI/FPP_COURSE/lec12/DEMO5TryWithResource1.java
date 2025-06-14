package MUI.FPP_COURSE.lec12;

import java.util.Scanner;

public class DEMO5TryWithResource1 {

	public static void main(String[] args) throws Exception {

		try(var ex1 = new MyClassAutoCloseable();var ex2 = new MyClassCloseable();Scanner sc = new Scanner(System.in)) {

			System.out.println(ex1.getNum());
			System.out.println(ex2.getNum());

			System.out.println("Type something");
			System.out.println(sc.nextLine());
		}

	}

}
