package by.cdp.jb27_les03.main;
import java.util.Scanner;
public class QtyOfDays {
  public static void main(String[] args) {
	  int y, m, col_day ;
	  y=readYearFromConsole();
	  m=readMonthFromConsole();
	  col_day=QtyDays(y,m);
	  printResult(m,y,col_day);
  }
  public static int readYearFromConsole() {
	  Scanner sc=new Scanner(System.in);
	int y=0;
	System.out.println ("Enter year: ");
	while (!sc.hasNextInt()) {
		sc.next();
		System.out.println ("Enter valid year: ");
	   }
	y=sc.nextInt();
	return y;
  }
  public static int readMonthFromConsole() {
	  Scanner sc=new Scanner(System.in);
	int m=0;
	System.out.println ("Enter month: ");
	while (!sc.hasNextInt()) {
	      sc.next();
	      System.out.println ("Enter valid month: ");
	     }
	m=sc.nextInt();
	return m;
  }
  
  public static int QtyDays(int y, int m) {
	  int col_day=0;
	  switch (m) {
	     case 1:
	     case 3:
	     case 5:
	     case 7:
	     case 8:
	     case 10:
	     case 12:
		    col_day=31;
		    break;
	     case 2: 
	    	 if (y%4==0) {
	    		 col_day=29;
	    	 } else {
	    		 col_day=28;
	    	 }
	    	 break;
	     case 4:
	     case 6:
	     case 9:
	     case 11:
	    	 col_day=30;
	    	 break;
	  }
	  return col_day;
  }
  
  public static void printResult(int m, int y, int col_day) {
	  System.out.println("There are "+col_day+" days in month #"+m+" of " +y+" year");
  }
}
