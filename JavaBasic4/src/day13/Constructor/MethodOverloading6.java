package day13.Constructor;

class SuperClass {
	void msg(int x, int y) {
		System.out.println("Hello Java");
	}
}

class Subclass {
	void msg(double x, double y) {
		System.out.println("Welcome you in Java programming");
	}
}

public class MethodOverloading6 {
	public static void main(String[] args) {
		Subclass sc = new Subclass();
		sc.msg(10, 20);
		sc.msg(2.5, 3);

		SuperClass sc1 = new SuperClass();
		sc1.msg(20, 30);
	}

}
