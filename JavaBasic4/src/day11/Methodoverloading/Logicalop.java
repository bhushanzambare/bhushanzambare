package day11.Methodoverloading;

public class Logicalop {

	public static void main(String[] args) {
		// Variable Definition and Initialization
		int age = 18;
		char blgrp = 'A';
		boolean res1, res2;
		res1 = (age > 18);
		res2 = (blgrp == 'A');
		System.out.println("Result1: " + res1);
		System.out.println("Result2: " + res2);

//Logical AND
		System.out.println("bool1 && bool2 =" + (res1 && res2));

//logical OR
		System.out.println("bool1 ||  bool2 =  " + (res1 || res2));

//logical NOT
		System.out.println("!(bool1  &&  bool2) =" + !(res1 && res2));
	}

}
