package day14Conditions;

public class Pyramid1 {

	public static void main(String[] args) {

		System.out.println("***********Nested for Loop-half pyramid*********************");

		for (int i = 0; i < 5; i++) { // no of line in pyramid
			for (int j = 0; j <= i; j++) {
				System.out.println(" *      ");// format to be printed
			}
			System.out.println();
		}
		System.out.println("*************Nested for loop-half inverted pyramid**********************");
		for (int i = 0; i < 5; i++) { // no of line in pyramid
			for (int j = 5; j > i; i--) {
				System.out.println("*    ");// format to be printed
			}
			System.out.println();
		}
	}

}
