package PracticeProgram;

public class QuotientRem {

	public static void main(String[] args) {
		System.out.println("Program Starts....");
		System.out.println("Quotient is  " + getquo(20, 5));
		System.out.println("Remainder is  " + getrem(20, 4));

		System.out.println("Program Ends...");

	}

	public static int getquo(int a, int b) {
		int quotient = a % b;
		// System.out.println("Quotient is "+quotient);
		return quotient;
	}

	public static int getrem(int c, int d) {
		int rem = c / d;
		// System.out.println("remainder is "+rem);
		return rem;
	}
}
