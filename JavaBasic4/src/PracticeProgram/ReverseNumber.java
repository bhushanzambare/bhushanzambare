package PracticeProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getReverseNumber(1234);
	}

	public static int getReverseNumber(int num) {
		int i;
		int rev = 0;
		int digit = 0;
		System.out.println("Original Number is " + num);
		for (; num != 0;) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse Number is " + rev);

		return rev;
	}
}
