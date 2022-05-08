package day11Operator;

public class UnaryopAssignment {

	public static void main(String[] args) {

		int a = 0, b;
		b = a++ + ++a + ++a + a;
		// b =
		System.out.println(a);
		System.out.println(b);
		System.out.println("*******************************");

		a = 0;
		b = a-- + --a + --a + a;
		// b =
		System.out.println(a);
		System.out.println(b);
		System.out.println("************************************");

		a = 0;
		b = --a + --a + --a + a + ++a + a++;
		// b =
		System.out.println(a);
		System.out.println(b);
		System.out.println("****************************************");

		a = 0;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		// b =
		System.out.println(a);
		System.out.println(b);
	}

}
