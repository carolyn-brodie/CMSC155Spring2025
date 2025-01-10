package week11.setsMaps;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// First set up a test set - notice difference in the order
		
		Set<String> names = new TreeSet<>();
		names.add("Cory");
		names.add("Drake");
		names.add("Bob");
		names.add("Aiden");

		
		System.out.println(names);
		
		if (names.contains("Bob")) {
			names.remove("Bob");
		}
		//Note this is an Iterator and not a ListIterator
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		 
//		
//		for (String element : names) {
//			System.out.println(element);
//		}

	}

}
