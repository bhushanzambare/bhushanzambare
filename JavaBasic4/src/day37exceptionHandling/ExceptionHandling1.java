package day37exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Program Starts from here...");
		// 1. abnormal statements
		int i, j, k;
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Enter first num1:  ");
			i = scn.nextInt();
			System.out.println("Enter first num2:  ");
			j = scn.nextInt();
			k = i / j;// AritmaticException
			System.out.println("res:  " + k);
		} catch (ArithmaticException obj) {
			System.out.println("Exception handeled" + obj);
			// obj.printstackTrace();
		}
		System.out.println("program ends here....");
	}

}
