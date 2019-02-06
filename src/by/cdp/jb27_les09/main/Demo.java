package by.cdp.jb27_les09.main;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {

	public static void main (String[] args) {
		
		Library myLibrary = new Library();
		
		Book book1 = new EducationBook("Ivanov", "High Math", 2011, 30, "Math");
		Book book2 = new HobbyBook("Perro","Cinderella",1990,20,"Entertainment");
		Book book3 = new HobbyBook("Pushkin","Gold fish",2001,17,"Fairy-tail");
		Book book4 = new HobbyBook("Pushkin","Gold fish",2004,13,"Fairy-tail");
		Book book5 = new HobbyBook("Pushkin","New book",2003,11,"Fairy-tail");
		Book book6 = new ProgrammingBook("Ekkel","Art of Programming",1986,46,"IT","High");
		Book book7 = new Book("Petrov", "Russian", 2005, 20);
		
		myLibrary.add(book1);
		myLibrary.add(book2);
		myLibrary.add(book3);
		myLibrary.add(book4);
		myLibrary.add(book5);
		myLibrary.add(book6);
		myLibrary.add(book7); 
		
		
		
		myLibrary.printAsList(myLibrary.getBooks());
		
		myLibrary.delete(book2);
	       
		myLibrary.printAsTable(myLibrary.getBooks());
	     
	    myLibrary.findByAuthor("Pushkin");
	    
	    System.out.println("-------------------------------------------");
	    
	    
	    /////////////////////////////////////////////////////////////////////////////////////
	    
	    
	    Comparator<Book> comparator1 = new PriceComparator();
	    
	    TreeSet<Book> treeset = new TreeSet<>(comparator1);
	    treeset.add(book1);
	    treeset.add(book2);
	    treeset.add(book3);
	    treeset.add(book4);
	    treeset.add(book5);
	    treeset.add(book6);
	    treeset.add(book7);
	    
	    
	  	System.out.println("\n\nFound book(s) sorted by Price : ");
			
			for (Book book: treeset) {
				if (book.getAuthor().equals("Pushkin")) {
							System.out.println(book);
				}
			}
		
			
			Comparator<Book> comparator2 = new YearPublishedComparator();
			TreeSet<Book> treeset2 = new TreeSet<>(comparator2);
		    treeset2.add(book1);
		    treeset2.add(book2);
		    treeset2.add(book3);
		    treeset2.add(book4);
		    treeset2.add(book5);
		    treeset2.add(book6);
		    treeset2.add(book7);
		    
		    
            System.out.println("\n\nFound book(s) sorted by YearPublished : ");
			
			for (Book book: treeset2) {
				if (book.getAuthor().equals("Pushkin")) {
							System.out.println(book);
				}
			}
		    
		}
	    
	  
	
	}
	

	
	
	

	
