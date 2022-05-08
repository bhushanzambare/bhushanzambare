package day13.Constructor;

class A {
	int i = 10;

	A() {
		System.out.println("Running class A() constructor...");
	}

	void display() {
		System.out.println("I am display() of class A.");
	}
}

class X {
	int j = 20;

	X() {
		System.out.println("Runnig class X() constructor..");
	}

	void display() {
		System.out.println("I am display() of class X.");
	}
}

public class Cons5 {
	void display() {
		System.out.println("I am display() of class Cons5. ");
	}

	public static void main(String[] args) {
		System.out.println("Main() of Class Cons5 is started...");
		A a1 = new A();
		a1.display();
		System.out.println("Class A global Variable i = " + a1.i);
		X x1 = new X();
		x1.display();
		System.out.println("Class X global Variable j = " + x1.j);
		Cons5 c1 = new Cons5();
		c1.display();
		System.out.println("Main() of class Cons5 is ends here...");

	}

}
