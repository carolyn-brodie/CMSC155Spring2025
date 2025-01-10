package week11.setsMaps;

import java.util.Iterator;
import java.util.Set;


public class Printers {
	
	//instance variables
	Set<String> printSet;
	
	//constructor
	public Printers(Set<String> printList) {
		printSet = printList;
	}

	//toString
	public String toString() {
		return printSet.toString();
	}
	
	//Start printers
	public void startPrinters() {
		Iterator<String> iter = printSet.iterator();
		while (iter.hasNext()) {
			//start printer in a real system
			String element = iter.next();
			System.out.println(element + " is started");
		}
	}
}
