package day13.Constructor;

class ConsOverloading2 {

	static int age;
	double salary;

	ConsOverloading2() {
		System.out.println("==================Zero-Parameterized Constructor Started.....============================");
		System.out.println("having no parameter");
		System.out.println("==================Zero-Parameterized Constructor Ends.....============================");
	}

	ConsOverloading2(double b) {
		System.out.println("===============double Parameterized Constructor===============================");
		System.out.println("having double parameter");
		System.out.println("===============double Parameterized Constructor Ends...===============================");
	}

	ConsOverloading2(int a, double b) {
		System.out.println("============int-double parameterized constructor started===================");
		age = a;
		salary = b;
		System.out.println("having int-double parameters");
		System.out.println("============int-double parameterized constructor Ends....==================");
	}

	public static void main(String[] args) {
		ConsOverloading2 pc1 = new ConsOverloading2();
		System.out.println("After Zero-Para constructor,Age= " + pc1.age);
		System.out.println("After Zero-Para constructor,salary= " + pc1.salary);

		ConsOverloading2 pc2 = new ConsOverloading2(33);
		System.out.println("After int-para constructor,Age= " + pc2.age);
		System.out.println("After int-para constructor,salary= " + pc2.salary);

		ConsOverloading2 pc3 = new ConsOverloading2(34000.34);
		System.out.println("After double-para contructor,Age= " + pc3.age);
		System.out.println("After double-para contructor,salary= " + pc3.salary);

		ConsOverloading2 pc4 = new ConsOverloading2(30, 95000.34);
		System.out.println("After int-double-para constructor,Age= " + pc4.age);
		System.out.println("After int-double-para constructor,salary= " + pc4.salary);
	}

}
