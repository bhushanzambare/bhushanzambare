package day13.Constructor;

 class ConsOverloading1 {

	ConsOverloading1() {
		System.out.println("Zero Parameterized Constructor");
		System.out.println("having no parameter");
	}

	ConsOverloading1(int a) {
		System.out.println("Parameterized Constructor");
		System.out.println("having int parameter");
	}

	ConsOverloading1(double b) {
		System.out.println("Parameterized Constructor");
		System.out.println("having double parameter");
	}

	ConsOverloading1(int a, double b, int c) {
		System.out.println("Parameterized Constructor");
		System.out.println("having int,double,int parameter");
	}

	ConsOverloading1(double a, int b, int c) {
		System.out.println("Parameterized Constructor");
		System.out.println("having double,int ,int parameter");
	}

	public static void main(String[] args) {
		ConsOverloading1 pc5 = new ConsOverloading1();
		ConsOverloading1 pc1 = new ConsOverloading1(12);
		ConsOverloading1 pc2 = new ConsOverloading1(13.34);
		ConsOverloading1 pc3 = new ConsOverloading1(10, 13.34, 45);
		ConsOverloading1 pc4 = new ConsOverloading1(13.34, 23, 87);

	}

}
