package day40Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//Creating arraylist
		list.add("Mango");//auto-upcasting from string to object class object
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		//Printing the arraylist object
		System.out.println("size of list: "+list.size());
		System.out.println("Elements of list: "+ list);
		System.out.println("Transversing list through for loop: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Transversing list through for loop: ");
		//Traversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		//accessing the element
		System.out.println("Returning element: "+ list.get(1));//it will return the 2nd element, because index start
		//from 0
		//changing the element 
		list.set(1, "Dates");
		System.out.println("size of list:  "+ list.size());
		System.out.println("Elements of list:" + list);
		
		//Sorting the list
		Collections.sort(list);//by default it sort the passed collection element in assending order  and  store  it in the same collection 
		System.out.println("size of list: "+ list.size());
		System.out.println("Elements of list: "+ list);
		
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list .iterator();
		/**
		 * List element: [Banana, Dates, Grapes, Mango]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//Banana
//		System.out.println(itr.next());//Dates
//		System.out.println(irt.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
	}

}
