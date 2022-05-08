package day13.Constructor;

public class Cons2 {

	int age;
	double salary;
	/*
	 * below is a default constructor, that will be written by java complier at compile time
	 * Cons2(){
	 *              //empty body
	 *      }
	 * 
	 */
	public static void main(String[] args) {
		Cons2 c1= new Cons2();
		System.out.println(c1.age);//0
		System.out.println(c1.salary);//0.0
	}

}
