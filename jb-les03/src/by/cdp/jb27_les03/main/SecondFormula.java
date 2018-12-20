package by.cdp.jb27_les03.main;
import java.util.Scanner;
public class SecondFormula {
	public static void main(String[] args) {
		double x, y;
		x=readXFromConsole();
		y=FX(x);
		printResult(x,y);
	}
	
	public static double readXFromConsole() {
		  Scanner sc=new Scanner(System.in);
		double x=0;
		System.out.println ("Enter x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println ("Enter valid x: ");
		   }
		x=sc.nextDouble();
		return x;
	  }
	
	public static double FX(double x) {
		double y=0;
		if (x<=-3) {
			y=9;
		}
		else if (x>3) {
			y=1/(x*x+1);
		}
		else {y=Double.NaN;
		System.out.println ("Function is not defined for such x-value");
		}
		return y;
	}
	
	public static void printResult(double x, double y) {
		System.out.println("y("+x+") = "+y);
	}
}
