package by.cdp.jb27_les02.main;
import java.util.Scanner;
public class Circle {
public static void main (String[] args) {
	double R;
	double S;
	double d;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter radius R: ");
	if  (sc.hasNextDouble()) {
		 
		R=sc.nextDouble();
		if (R>0) {
		         d=2*Math.PI*R;
		         S=Math.PI*R*R;
		         System.out.println("dlina okruzhnosti="+d+"\nploshad' kruga="+S);
		          }
		else {
			 System.out.println("invalid radius");
		 }
	}
	else {
		System.out.println("invalid radius");
	}
	
}
}
