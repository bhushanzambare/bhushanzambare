package day37exceptionHandling;

//No Exception in Program
public class ExceptionHandling7 {

	public static void main(String[] args) {
		try {
			// below code do not throw any exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// catch wont be executed
		catch (ArithmeticException e) {
			System.out.println("Exception handled....");
		}
//executed regardless of exception occured or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code....");
	}

}
