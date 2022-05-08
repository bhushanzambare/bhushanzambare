package day11Operator;

public class UnaryOp3 {

	public static void main(String[] args) {

		int a = 0, b;
		b = a++ + ++a + ++a + a;
		// b =0 + 2 + 3 +3
		System.out.println("a:  " + a);// 3
		System.out.println("b:  " + b);// 8
		System.out.println("*****************************");

		a = -5;
		b = a-- + --a + --a + a;
		// b =-5 + -7 + -8 + -8
		System.out.println("a: " + a);
		System.out.println("b:  " + b);
		System.out.println("**********************************");
		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		// b = -2 + -1 + 0 + 0 + 2 + 2 + 3
		System.out.println(a);
		System.out.println(b);

	}

}
