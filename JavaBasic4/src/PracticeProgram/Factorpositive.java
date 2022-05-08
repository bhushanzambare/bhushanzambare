package PracticeProgram;

public class Factorpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getfactors(39);
	}

	public static void getfactors(int num) {
		int i;

		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("Factors is " + i);
			}
		}
	}
}
