package day17.This;

class A {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
		// m();
	}
}

class ThisKeyword3 {

	void methodOne() {
		System.out.println("Inside Method One");
	}

	void methodTwo() {
		System.out.println("Inside Method Two");
		this.methodOne();// same as calling methodOne()
		// methodOne();

	}

	public static void main(String[] args) {
		ThisKeyword3 obj = new ThisKeyword3();
		obj.methodTwo();
		A a = new A();
		a.n();

	}

}
