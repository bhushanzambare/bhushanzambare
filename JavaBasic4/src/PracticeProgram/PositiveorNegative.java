package PracticeProgram;

public class PositiveorNegative {

	public static void main(String[] args) {
		PositiveorNegative p1 = new PositiveorNegative();
		p1.checkPositiveorNegative(-3);

	}

	void checkPositiveorNegative(int num) {
		if (num > 0) {
			System.out.println("Number is Positive");
		} else {
			System.out.println("Number is Negative");
		}
	}

}
