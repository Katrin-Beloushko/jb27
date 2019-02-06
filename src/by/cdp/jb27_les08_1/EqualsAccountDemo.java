package by.cdp.jb27_les08_1;

public class EqualsAccountDemo {

	public static void main (String[] args) {
		int sum=0;
		Account account1 = new Account("Ivanov","a123",6);
		Account account2 = new Account ("Ivanov","a123",5);
		
		System.out.println(account1);
		System.out.println(account2);
		
		
		if (account1.equals(account2)) {
			
			sum = account1.getMoney()+account2.getMoney();
			System.out.println("There is "+ account1.getOwner()+"'s account: "+sum+ "$ on account in general");
			
		} else {
			
			System.out.println("different accounts");
		}
		
	}
}