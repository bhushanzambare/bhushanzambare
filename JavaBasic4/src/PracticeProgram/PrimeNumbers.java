package PracticeProgram;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrimeNumber(12);
	}

	public static void getPrimeNumber(int num1) {
		int i = 2;
		for (i = 2; i <= num1; i++) {
			if (num1 % i == 0) {
				System.out.println("It is not Prime number");
				break;
			} else {
				System.out.println("It is Prime number");
				break;
			}
		}
	}
}
