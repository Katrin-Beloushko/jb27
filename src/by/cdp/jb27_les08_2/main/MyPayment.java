package by.cdp.jb27_les08_2.main;

import java.util.ArrayList;
import java.util.List;

public class MyPayment {
	
	public static void main(String[] args) {
		Payment myPayment = new Payment();
		
		myPayment.add(new Good("apple",6));
		myPayment.add(new Good("apple","green", 15));
		myPayment.add(new Good("potato",10));
		myPayment.add(new Good("cucumber",7));
		myPayment.add(new Good("potato",8));
		myPayment.add(new Good("bread",5));
		
		Good findGood = myPayment.findByName("apple");
		
				
		if (findGood != null) {
			System.out.println(findGood);
		}
		
		print(myPayment);
	}
	
		public static void print (Payment payment) {
		List<Good> printGood = payment.getPayment();
		System.out.println ("\nWhole Payment: ");
			for (int i=0; i<printGood.size();i++) {
				Good good = printGood.get(i);
				print(good);
			}
		}
		
		public static void print (Good good){
			System.out.println("Good:  ["+good.getName()+", "+good.getPrice()+", "+good.getColor()+"]."); 
	}
	}

