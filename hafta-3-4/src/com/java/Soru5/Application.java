package com.java.Soru5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("Sefiller",90));
		books.add(new Book("Sefiller2",200));
		books.add(new Book("Sefiller3",300));
		books.add(new Book("Sefiller4",400));
		books.add(new Book("Sefiller5",500));
		books.add(new Book("Sefiller6",600));
		books.add(new Book("Sefiller7",700));
		books.add(new Book("Sefiller8",800));
		books.add(new Book("Sefiller9",900));
		books.add(new Book("Sefiller10",1000));
		
		Predicate<Book> moreThan100 = (book) -> {
			return (book.getPageNumber() > 100);
		};
		
		Set<Book> greaterThan100 = books.stream().filter(moreThan100).collect(Collectors.toSet());

		Consumer<Book> bookPrinter = (book) -> System.out.println(book);

		greaterThan100.stream().forEach(bookPrinter);
		
		

	}

}
