package day40Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List elements : " + list);

		HashSet<String> set = new HashSet(list);
		set.add("Gaurav");
		System.out.println("set elements: " + set);
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("*************************");
		set.forEach(s1 -> s1.contains("Ravi"));
		System.out.println("set elements: " + set);

	}

}
