package PracticeProgram;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkArmstrong(153);
	}

	public static void checkArmstrong(int num) {
		int temp = num;
		int mod, res = 0;
		while (num > 0) {
			mod = num % 10;
			res = res + (mod * mod * mod);
			num = num / 10;
		}
		if (res == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}

}
