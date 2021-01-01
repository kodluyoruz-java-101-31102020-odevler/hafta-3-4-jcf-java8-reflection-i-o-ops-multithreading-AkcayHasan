package com.java.Soru2;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		int book1PageNumber = o1.getPageNumber();
		int book2PageNumber = o2.getPageNumber();

		
		return Integer.compare(book1PageNumber, book2PageNumber);
	}
	
	
	

}
