package by.cdp.jb27_les08_2.main;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private List<Good> payment = new ArrayList <Good>();
	
	public Payment() {
	}
	
	public List<Good> getPayment(){
		return payment;
	}

	public void add(Good good) {
		payment.add(good);
	}
	
	
	public Good findByName(String name) {
    	for (Good good: payment) {
    			if (good.getName().equals(name)) {
    				System.out.println("Found by name ---- ");
    				return good;
    			}
    	}
    	System.out.println ("There is no such good ");
    	return null;
    	
    }
    	
     
    
}
