package day20.Opps;

//Base class or parent class or super class
class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

//Inherited class or child class or sub class
class Child extends Parent {
	// This method Overrides show() of Parent
	@Override
	void show() {
		System.out.println("child's show()");
	}
}

//Driver class
class Overriding5 {

	public static void main(String[] args) {
		// If a parent type reference refers to a parent object, then parents show is
		// called
		Parent obj1 = new Parent();
		obj1.show(); // Parent's show()
		// If a parent type reference refers to a child object childs show() is
		// called.This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();// Child's show()

	}

}
