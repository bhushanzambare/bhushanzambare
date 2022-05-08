package day32PredefinedClasses;
class Singleton {
	//Static Variable single_instance = new Singleton
	private static Singleton single_instance = new Singleton();
	//Declaring a variable of type String
	public String s;
	//Constructor of this class, Here private constructor is used to restricted to this class itself
	private Singleton() {
		s="Hello I am string part of Singleton class";
		
	}
	//Method static method to create instance of Singleton class
	public static Singleton getInstanceOfSingleton() {
		//To ensure only one instance is created
		return single_instance;
		
	}
}
public class SingletonClass {
//Main Driver method
	public static void main(String[] args) {
		//Instantiating Singleton class with variable x
		Singleton x = Singleton.getInstanceOfSingleton();
		System.out.println("String from x is: " + x.s);
		// Instantiating Singleton class with variable y
		Singleton y = Singleton.getInstanceOfSingleton();
		System.out.println("String from y is: " + y.s);
		// instantiating Singleton class with variable z
		Singleton z = Singleton.getInstanceOfSingleton();
		System.out.println("String from z is: " + z.s);
		// Now changing variable of instance x via toUpperCase() method
		System.out.println("**********After converting to upper case*********");
		x.s = (x.s).toUpperCase();
		// Print and display commands
		System.out.println("String from x is: " + x.s);	
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
		System.out.println("\n");
		// Now again changing variable of instance x
		System.out.println("**********After converting to lower case*********");
		z.s = (z.s).toLowerCase();
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);

	}

}
