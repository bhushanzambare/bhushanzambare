package day11.Methodoverloading;

public class TotalRecallConcepts {

	static int age1 = 35;
	int age2 = 56;
	static double salary = 2536.0326;
	double salary2 = 256.898;

	public static void main(String[] args) {
		System.out.println("sgv is: " + age1);
		System.out.println("sgv is: " + salary);
		System.out.println("****************static Global Variable************************************");
		TotalRecallConcepts ref = new TotalRecallConcepts();
		System.out.println("nsgv is: " + ref.age2);
		System.out.println("nsgv is: " + ref.salary2);
		System.out.println("************Non static Global Variable*******************************************");

		int num1 = 20, num2 = 30;
		int res;
		res = num1 + num2;
		System.out.println("Addition Result : " + res);
		System.out.println("****************Local Variable***************************888888");

		TotalRecallConcepts m1 = new TotalRecallConcepts();
		m1.display('A', 32, 45000);
		m1.display('C', 23, 25000);
		System.out.println("******************MethodOverloading***********************************");

		getAdditionResult(25, 30);
		TotalRecallConcepts.getAdditionResult(250.36, 45);
		System.out.println("****************Static+non Static Method**********************************");

	}

	static void getAdditionResult(double num1, int num2) {
		double res = num1 + num2;
		System.out.println("Result: " + res);
	}

	void getAdditionResult(double num1, double num2) {
		double res = num1 + num2;
		System.out.println("Result: " + res);
	}

	void display(char grade, int age, int salary) {

		System.out.println(
				"*******************display (char,int,int with param startad)*******************************************");
		System.out.println("Grade is: " + grade);// A
		System.out.println("Age is: " + age);// 25
		System.out.println("Salary is: " + salary);// 45000
		System.out.println(
				"*********************display(char,int,int with param ends)***********************************************");

	}

	void display(int age, char grade, int salary) {

		System.out.println(
				"*********************display(int,char,int)with program started*********************************************8");

		System.out.println("Age-Grade-Salary is: " + age + "-" + grade + "-" + salary);// 30-B-45000

		System.out.println("*******************display(int,char,int)with param ends**************************");

	}
}
