package by.cdp.jb27_les03.main;
import java.util.Scanner;
public class TrueFalse {
public static void main (String[] args) {
	int digit;
	boolean tf;
	digit=readDigitFromConsole();
	tf=TF(digit);
	printResult(tf, digit);
}
public static int readDigitFromConsole() {
	  Scanner sc=new Scanner(System.in);
	int digit=0;
	System.out.println ("Enter integer value: ");
	while (!sc.hasNextInt()) {
		sc.next();
		System.out.println ("Enter valid integer value: ");
	   }
	digit=sc.nextInt();
	return digit;
}

public static boolean TF(int digit) {
	int num=0; boolean tf=false; 
	while (digit !=0) {
		num = digit % 10; 
		digit=digit/10;
		   if (num % 2 == 0) {
			         tf=true; 
		             }
	}
	return tf;
		
}

public static void printResult(boolean tf, int digit) {
	if (tf==true) {
		System.out.println ("V chisle " +digit+ " est' chetnye cifry");
	}
	else {System.out.println ("V chisle " +digit+ " net chetnyh cifr");
    }
   }
}
