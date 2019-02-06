package by.cdp.jb27_les09.main;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> libs= new ArrayList<Book>(); //(new PriceComparator());
	
	public Library() {
		
	}
	
	public List<Book> getBooks(){
		return libs;
	}
	
	public void add (Book book) {
		libs.add(book);
	}
	
	public boolean delete (Book book) {
		boolean k = libs.remove(book);
		if (k == true) {
			System.out.println("\n--------------------------");
	    	System.out.println("\nOne book is removed from library\n");
	    } else {
	    	System.out.println ("\nNothing is deleted\n");
	    }
		return k;
	}
	
	
	
	public List<Book> findByAuthor(String author) {
		
		System.out.println("\nFound book(s) without sorting : ");
		
		for (Book book: libs) {
			if (book.getAuthor().equals(author)) {
						System.out.println(book);
			}
		}
	
		return null;
	}
	
	

	
	public void printAsList (List<Book> libs) {
		
		System.out.println ("The list of Books: -------------------");
			for (Book book : libs) {
				System.out.println (book.toString());
		}
		}
		
	
	
	
	public void printAsTable (List<Book> libs) {
		
		 System.out.println ("Table of Books: -------------------");
		 System.out.print ("+----------------------+----------------------+----------------------+----------------------+\n");
		 System.out.printf("| %-20s | %-20s | %-20s | %-20s |%n", "Author", "Title", "Year published", "Price" );
		 System.out.print ("+----------------------+----------------------+----------------------+----------------------+\n");
		 
		 for (Book book: libs) {
			 System.out.printf("| %-20s | %-20s | %-20s | %-20s |%n", book.getAuthor(), book.getName(), book.getYearPublished(), book.getPrice());
				 
		 }
		 System.out.print ("+----------------------+----------------------+----------------------+----------------------+\n");
		 
	
	}
	
	
}
	
