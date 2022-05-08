package day13.Constructor;

class B {
	int i = 10;

	B() {
		System.out.println("Running Class B constructor..");
		i = 23;
	}
}

public class Cons7 {

	public static void main(String[] args) {
		System.out.println("Main() of class Cons7 is started...");
		B b1 = new B();
		System.out.println("Class B global variable i= " + b1.i);
		System.out.println("===================================================");
		B b2 = new B();
		System.out.println("Class B gobal variable i= " + b2.i);
		System.out.println("Main() of class Cons7 is ends here");

	}

}
