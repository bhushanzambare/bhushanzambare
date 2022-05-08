package day20.Opps;

// final methods cannot be overridden
class Parent3 {
	// Can't be overridden
	// final void show() ------>eithe comment navte i put comment bcoz program is for understanding so error dikh raha tha to comment dala
	{
		System.out.println("I am final method of Parent class");
	}
}

class child3 extends Parent3 {
	// This would produce error
	void show() {
		System.out.println("I am show method of child3 class");
	}
}

//Driver class 
class Overriding7 {

	public static void main(String[] args) {

	}

}
