package by.cdp.jb27.les06;

import java.util.Scanner;

public class FractionDemo {

	public static void main(String[] args) {
		int qty = enterQtyOfFractions();
		Fraction[] mas = new Fraction[qty];
		enterFractionsFromConsole(mas);
		printFractions(mas);
	}
		
	
        public static int enterQtyOfFractions() {
        	        	
        	Scanner sc = new Scanner (System.in);
    		System.out.println ("Enter quantity of fraction ");
    		
    		
    		while(!sc.hasNextInt()) {
    			sc.next();
    			}
		    return sc.nextInt();
		}
	
	    public static void enterFractionsFromConsole(Fraction[] mas) {
	    	
	    	int num;
	    	int den;
		    double z;
	    	for(int i=0; i<mas.length; i++) {
	    		System.out.println ("Enter num/den : ");
	    		Scanner sc = new Scanner(System.in);
	    		
	    		while(!sc.hasNextInt()) {
	    			sc.next();
	    		}
	    		
	    		num  = sc.nextInt();
	    		
				while(!sc.hasNextInt()) {
					sc.next();
				}
				
				den = sc.nextInt();
				if (den == 0) {
					z=  Double.NaN;
				 System.out.println (z + ": Invalid denominator");
				}else 
					mas[i] = new Fraction(num,den);
	         }
	
	      }
	

	      public static void printFractions(Fraction[] mas) {
	    	  
	    	  System.out.println ("Entered fraction(s) : ");
	    	  
	    	  for (int i=0; i<mas.length; i++) {
	    		  System.out.println (mas[i]+" ");
	    	  }
	      }
}

