package day14Conditions;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are :");
		int primeCount = 0;
		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = ++counter;
				}
			}
			if (counter == 2) {
				System.out.println("Prime Number: " + i);
				primeCount++;
			}
		}
		System.out.println("Total Prime number count: " + primeCount);

	}

}
/*
 * next line :F6 inside function or method:F5 value of variable:ctrl+shift+i
 * continue : F8
 * 
 */
