package day40Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map m1 = new HashMap();
		m1.put("key1", "admin");
		m1.put("key2", "admin");
		m1.put(null, "admin123");
		System.out.println("Map elements are: " + m1);
		System.out.println("Map element count: " + m1.size());
		m1.put("key2", "manager");
		m1.put(null, 123);
		System.out.println("Map elements are: " + m1);
		System.out.println("Map elements count: " + m1.size());

		System.out.println("key set of map: " + m1.keySet());
		System.out.println("values of map: " + m1.values());

	}

}
