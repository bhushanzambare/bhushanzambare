package PracticeProgram;

public class FactorNegative {

	public static void main(String[] args) {
		getfactors(-90);

	}

	public static void getfactors(int num) {
		int i;

		for (i = -1; i >= num; i--) {
			if (num % i == 0) {
				System.out.println("Factors is " + i);
			}
		}
	}

}
