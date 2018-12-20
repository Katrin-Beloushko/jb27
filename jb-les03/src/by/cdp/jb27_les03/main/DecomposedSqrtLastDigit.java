package by.cdp.jb27_les03.main;
import java.util.Scanner;
public class DecomposedSqrtLastDigit {
public static void main(String[] args) {
	int x=0;
	int y=0;
	x=readXFromConsole();
	y=lastSQRNum(x);
	printResult(x,y);
}

public static int readXFromConsole() {
	Scanner sc=new Scanner(System.in);
	int x;
	System.out.print("Enter x: ");
	while (!sc.hasNextInt()) {
		sc.next();
		System.out.println("Enter valid x: ");
	}
		x=sc.nextInt();
		return x;
	}

public static int lastSQRNum(int x) {
	int lastSqr=0;
	int lastNum=0;
	lastNum=x%10;
	switch(lastNum) {
	case 0:
		lastSqr=0;
		break;
	case 1:
	case 9:
		lastSqr=1;
		break;
	case 2:
	case 8:
		lastSqr=4;
		break;
	case 3:
	case 7:
		lastSqr=9;
		break;
	case 4:
	case 6:
		lastSqr=6;
		break;	
	case 5:
		lastSqr=5;
		break;
    }
		return lastSqr;
	
	
}
public static void printResult(int x, int y) {
	System.out.println("The last digit of "+x+"^2 = "+y);
}
}
