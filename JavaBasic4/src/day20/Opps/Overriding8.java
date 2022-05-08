package day20.Opps;

class Parent4 {
	// Static method in base class which will be hidden in subclass
	static void m1() {
		System.out.println("From parent " + "static m1()");
	}

	// Non-static method which will be overriden in derived class
	void m2() {
		System.out.println("From Parent " + "non-static (instance)m2()");
	}
}

class Child4 extends Parent4 {
	// This method hides m1() in Parent
	static void m1() {
		System.out.println("Fron child static m1()");
	}

	// This method overrides m2() in Parent
	@Override
	public void m2() {
		System.out.println("From child " + "non-static(instance) m2()");
	}
}

//Driver class
class Overriding8 {

	public static void main(String[] args) {
		Parent4 obj1 = new Child4();
		obj1.m1();
		// Here overriding works and child's m2() is called
		obj1.m2();

	}

}
