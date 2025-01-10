package week11.setsMaps;

import java.util.HashSet;
import java.util.Set;

public class PrinterTester {



	public static void main(String[] args) {
		// First test with a hashset
		Set<String> printHash = new HashSet<>();
		printHash.add("WestHall");
		printHash.add("EastSide");
		printHash.add("NorthBasement");
		printHash.add("SecondFloor");
		
		Printers myPrinters = new Printers(printHash);
		System.out.println(myPrinters);
		
		myPrinters.startPrinters();
		
		System.out.println("----------------");
		//Now try with a TreeSet
//		Set<String> printTree = new TreeSet<>();
//		printTree.add("WestHall");
//		printTree.add("SecondFloor");
//		printTree.add("EastSide");
//		printTree.add("NorthBasement");
//		
//	
//		
//		Printers myPrinters2 = new Printers(printTree);
//		System.out.println(myPrinters2);
//		
//		myPrinters2.startPrinters();

	}

}
