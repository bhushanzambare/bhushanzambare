package day40Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample0 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to object class object
		list.add(1235);// first boxing to Integer class object---->uocasting to object class
		list.add("Banana");
		list.add('C');// First boxing ti character class object---->upcasting to object class
		list.add(15.26);// first boxing to Double Class object----> upcasting to object class
		list.add(true);// first boxing to Boolean class object----->upcasting to object class
		list.add(new ArrayListExample0());// ArraylistExample1 class object will be upcasted to Object class object
		// Printing the arrylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Element of list: " + list);
		System.out.println("Transversing list through for loop: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Transversing list through for-each loop: ");
		// Trasversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element,because index starts

		// from 0
		// changing /update existing object
		list.set(1, "Dates");
		System.out.println("size of list:  " + list.size());
		System.out.println("Elements of list:  " + list);

	}

}
