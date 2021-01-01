package com.java.Soru2;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		Set<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("Sefiller",550,"Victor Hugo","1862"));
        bookSet.add(new Book("Narnia Günlükleri",400,"C. S. Lewis","1980"));
        bookSet.add(new Book("Büyük Saat",300,"Turgut Uyar","1970"));
        bookSet.add(new Book("Olasılıksız",500,"Adam Fawer","1990"));
        bookSet.add(new Book("Empati",600,"Adam Fawer","1950"));

        BookComparator bookComparator = new BookComparator();
        Set<Book> sortedByPageNumber = new TreeSet<Book>(bookComparator);
        sortedByPageNumber.addAll(bookSet);
        for (Book p : sortedByPageNumber){
            System.out.println(p);
        }
		

	}

}
