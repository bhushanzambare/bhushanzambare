package day19.Blocks;

public class ClassBody2 {

	static int sum = 45;// static Global Variable
	double salary = 55000;// Non-static Global Variable

	/* static Block */
	static {
		System.out.println("static block with A");
	}

	/* Non-static Block */
	{
		System.out.println("static block with B");
	}

	void Test1(int year) { // non-static method
		if (year % 4 == 0) {
			System.out.println("Its a leap year");
		} else {
			System.out.println("Its Not leap year");
		}
	}

	public static int getrem(int c, int d) { // static method
		int rem = c / d;
		return rem;
	}

	static double res;

	static public void square(int number) { // method overloading
		res = number * number;
		System.out.println("Method with Integer Argument Called: " + res);

	}

	static public void square(double number) {
		res = number * number;
		System.out.println("Method with float Argument Called: " + res);
	}

	public void main(String[] args) {
		System.out.println("SGV " + sum);
		ClassBody2 d1 = new ClassBody2();
		System.out.println("NSGV " + d1.salary);
		d1.Test1(2022);
		System.out.println("Remainder is  " + getrem(20, 4));
		ClassBody2.square(2.5f);
		ClassBody2.square(5);
		System.out.println("------------------------------------------------------------");
		
		System.out.println("SgV with " + Demo.Num);
		Demo r1 = new Demo();
		System.out.println("NSGV with " + r1.empsalary);
		System.out.println("Quotient is  " +r1. getquo(20, 5));
		System.out.println("Result of addition2: " + Demo.getAdditionResult(250.36, 45));
		Demo.display(500, 800, 900);
		r1.display();

	}
}

class Demo {
	static int Num = 55;// static Global Variable
	float empsalary = 45000;// Non-static Global Variable

	static { // static Block
		System.out.println("static runnig block with A");
	}

	{ // Non-static Block
		System.out.println("static runnig block with B");
	}

	public int getquo(int a, int b) { // non-static method
		int quotient = a % b;
		return quotient;
	}

	static double getAdditionResult(double num1, double num2) { // static method
		double res = num1 + num2;
		return res;
	}

	public static void display(int a, int b, int c) { // Method Overloading
		if ((a > b && a > c)) {
			System.out.println("A is greater");

		}
		if ((b > a && b > c)) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}

	void display() {
		char i;
		for (i = 'A'; i <= 'Z'; i++)
			;
		{
			System.out.println("" + i);

		}
	}
}
