package day40Collection;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
//	ArrayList <Integer>l1 = new ArrayList<Integer>();//Generic
//	l1.add(12);
//	ArrayList<Boolean> 12 = new ArrayList<Boolean>();//Generic
//	12.add(true);
//	ArrayList<Character> 13 =  new ArrayList<Character>();//Generic
//	13.add('a');
//
		ArrayList<String> al = new ArrayList<String>();// Generic
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("An initial list of elements: " + al);
		// Removing specific elements from arraylist
		System.out.println("remove Vijey from Collection: " + al.remove("Vijay"));
		System.out.println("After invoking remove(object) method: " + al);
//Removing element on the basis  of specific position
		System.out.println("remove index 0 from collection: " + al.remove(0));
		System.out.println("After invoking remove (index) method : " + al);
		System.out.println("**********************************************************");
//Creating another arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
//Adding new elements to arraylist 
		al.addAll(al2);
		System.out.println("Updated list: " + al);
//Removing all the new elements to arraylist
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method: " + al);
//Removing elements on the basis of specified condition 
		al.removeIf(str -> str.contains("Ajay"));// Here,we are using Lambda expression
		System.out.println("After invoking removeIf() method: " + al);
//Removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear() method:" + al);

	}

}
