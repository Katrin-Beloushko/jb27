package by.cdp.jb27_les12;

//import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		FileReader reader = null;
	    
		
		try {
			String[] str = null; 
			reader = new FileReader("D:\\Work\\Books.txt");
			
			Scanner sc = new Scanner(reader);
			
			List<Book> library = new ArrayList<Book>();	
			
					
			while (sc.hasNext()) {
						
				str = sc.nextLine().split(";");
				String str1 = str[0]; 
				String str2 = str[1]; 
				String str3 = str[2]; 
				String str4 = str[3]; 
				library.add(new Book(str1, str2, Integer.parseInt(str3),Integer.parseInt(str4)));
			}
			
			
		    for (Book book: library) {
	     		System.out.println(book);
			}
			
		} catch (FileNotFoundException e) {
					e.printStackTrace();
			
		} catch (IOException e){
				    e.printStackTrace();
				    
		} finally {
				if (reader !=null) {
					try {
							reader.close();
					} catch (IOException e) {
							e.printStackTrace();
					}
				}
		}
		
	}

}


