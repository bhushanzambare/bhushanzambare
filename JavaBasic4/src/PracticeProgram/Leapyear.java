package PracticeProgram;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkleapyear(2022);
	}

	public static void checkleapyear(int year) {
		if (year % 4 == 0) {
			System.out.println("Its a leap year");
		} else {
			System.out.println("Its Not leap year");
		}
	}
}
