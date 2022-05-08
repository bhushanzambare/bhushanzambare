package day19.Blocks;

public class ClassBody {
	int mobileNum = 123;// non-static Global Variable
	static int mobileNumber = 130;

	static int age;
	double salary;
	/* static block or SIB */
	static {
		age = 20;
	}
	/* non-static block or IIB */
	{
		salary = 35000.32;
	}

	static double getAdditionResult(double num1, double num2) {
		double res = num1 + num2;
		return res;
	}

	public double getIntrest(int p, double r, int t) {
		return (p * r * t) / 100;
	}

	public static void Displaynumber(int a, int b, int c) {
		if ((a > b && a > c)) {
			System.out.println("A is greater");

		}
		if ((b > a && b > c)) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}

	void Displaynumber() {
		int i;
		for (i = 1; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("SGV with standard: " + ClassBody.mobileNumber);// 123
		ClassBody r1 = new ClassBody();
		System.out.println("mobilenum with r1 reference: " + r1.mobileNum);

		System.out.println("age:  " + ClassBody.age);
		System.out.println("-----------------------------------");
		ClassBody b1 = new ClassBody();
		System.out.println("salary: " + b1.salary);

		System.out.println("Result of addition2: " + ClassBody.getAdditionResult(250.36, 45));

		ClassBody m1 = new ClassBody();
		double res = m1.getIntrest(250000, 5.6, 60);
		System.out.println("Intrest: " + res);
		Displaynumber(100, 400, 300);
		ClassBody d1 = new ClassBody();
		d1.Displaynumber();
	}

}
