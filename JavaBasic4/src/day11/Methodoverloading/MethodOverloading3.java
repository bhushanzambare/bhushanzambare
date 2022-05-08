package day11.Methodoverloading;

class Adder {
	static int add(int a,int b) {
		return a +b;
	}
	static int add(int a,int b,int c) {
		return a +b +c;
	}
	
}
public class MethodOverloading3 {
	static void display() {
		System.out.println("I am display() of MethodOverloading3 class");
	}

	public static void main(String[] args) {

		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));
		
		//display();
		//or
		MethodOverloading3.display();
		
	}

}
