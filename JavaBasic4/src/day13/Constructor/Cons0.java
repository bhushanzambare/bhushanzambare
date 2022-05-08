package day13.Constructor;

public class Cons0 {

	int age = 10;

	Cons0() {
		// default constructor written by java complier at the time of compilation
	}

	public static void main(String[] args) {
		System.out.println("Program Starts...");
		Cons0 c1 = new Cons0();
		System.out.println(c1.age);
		System.out.println("Program ends..");

	}

}
