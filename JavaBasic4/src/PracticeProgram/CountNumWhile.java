package PracticeProgram;
//While loop program
public class CountNumWhile {

	public static void main(String[] args) {
		getCount(4567);
	}

	public static int getCount(int num) {
		int i;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of Digit is  " + count);
		return count;
	}
}