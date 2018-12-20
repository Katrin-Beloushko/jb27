package by.cdp.jb27_les03.main;
import java.util.Scanner;
public class FirstFormula {
	 public static void main(String[] args) {
	double a, b, h, func;
		 a=readStartFromConsole();
		 b=readEndFromConsole(a);
		 h=readStepFromConsole();
		 if (a<b) {
		 func=FX(a,b,h);}
		 else {func=FX(b,a,h);}
	 }
	 
	 public static double readStartFromConsole() {
			  Scanner sc=new Scanner(System.in);
			double a=0;
			System.out.println ("Enter first value: ");
			while (!sc.hasNextDouble()) {
				sc.next();
				System.out.println ("Enter valid first value: ");
			   }
			a=sc.nextDouble();
			return a;
		  }
	 
	 public static double readEndFromConsole(double a) {
		  Scanner sc=new Scanner(System.in);
		double b=0;
		System.out.println ("Enter last value: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println ("Enter valid last value: ");
		   }
		b=sc.nextDouble();
		return b;
		
	  }
	 
	 public static double readStepFromConsole() {
		  Scanner sc=new Scanner(System.in);
		double h=0;
		System.out.println ("Enter step: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println ("Enter valid step: ");
		   }
		h=sc.nextDouble();
		return h;
	  }
	 
	 public static double FX(double a, double b, double h) {
		 double y=0;
		 
		 if (h<=0) {
			 y=2*Math.tan(a/2)+1;
			 System.out.println("Step is not positive value so function is count as f(min value);\nf("+a+")="+y);
		 }
		 else {
		 System.out.println ("x     f(x)");
		 for (double x=a; x<=b; x=x+h) {
			 y=2*Math.tan(x/2)+1;
			 System.out.println(x+ "  "+y);
			 }
		 }
	 
		 
		return y;
		 
	 }
	 
	 
}
