package com.java.Soru2;

public class Book implements Comparable<Book> {

	private String name;
    private int pageNumber;
    private String writerName;
    private String date;
	
	public Book(String name,int pageNumber,String writerName,String date) {
		this.name=name;
		this.pageNumber=pageNumber;
		this.writerName=writerName;
		this.date=date;
	}
	
	public Book() {
		
	}
	
	public String getName() {
		return name;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public String getWriterName() {
		return writerName;
	}

	public String getDate() {
		return date;
	}

	@Override
	public int compareTo(Book book) {
		return this.getName().compareTo(book.getName());
	}
	
	@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getName());
        stringBuilder.append(" - ");
        stringBuilder.append(this.getPageNumber());
        stringBuilder.append(" - ");
        stringBuilder.append(this.getWriterName());
        stringBuilder.append(" - ");
        stringBuilder.append(this.getDate());

        return stringBuilder.toString();
    }

}
