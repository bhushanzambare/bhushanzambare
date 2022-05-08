package PracticeProgram;

public class Uppercase {

	public static void main(String[] args) {
		Uppercase U1 = new Uppercase();
		U1.Display();
	}

	void Display() {
		char i;
		for (i = 'A'; i <= 'Z'; i++) {
			System.out.println("   " + i);
		}
	}
}
