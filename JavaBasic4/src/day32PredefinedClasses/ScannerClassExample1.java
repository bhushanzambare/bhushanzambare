package day32PredefinedClasses;

import java.util.Scanner;

public class ScannerClassExample1 {

	public static void main(String[] args) {
		String s = "Hello,This is BasicJava.";
		// Create scanner Object and pass string in it
		Scanner scan = new Scanner(s);
		// Check if the scanner has a token
		System.out.println("Boolean Result: " + scan.hasNext());
		// Print the string
		System.out.println("string: " + scan.nextLine());
		scan.close();
		System.out.println("----------Enter your Details-----------------");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:  ");
		String name = in.next();
		System.out.println("Name:  " + name);
		System.out.println("Enter your age :  ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.println("Enter your salary:  ");
		double d = in.nextDouble();
		System.out.println("Sayary:  " + d);
		in.close();

	}

}
