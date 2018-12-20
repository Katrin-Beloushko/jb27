package by.cdp.jb27_les02.main;
import java.util.Scanner;
public class Formula {
	public static void main (String[] args) {
		double a, b, c, f, temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("введите a: ");
		while (!sc.hasNextDouble()) {
			sc.next();
	}
		a=sc.nextDouble();
		System.out.println("введите b: ");
		while (!sc.hasNextDouble()) {
			sc.next();
	}
		b=sc.nextDouble();
		System.out.println("введите c: ");
		while (!sc.hasNextDouble()) {
			sc.next();
	}
		c=sc.nextDouble();
		temp=b*b+4*a*c;
		if (a==0) {
			f=Double.NaN;
			System.out.println("знаменатель равен нулю");
		    } else if (temp>=0){
			        f=(b+Math.sqrt(temp))/(2*a)-a*a*a*c+b;
		            } else {
		            	   f=Double.NaN;
			               System.out.println("под корнем отрицательное число");
	                 }
		System.out.println("f="+f);
	}
}
