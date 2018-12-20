package by.cdp.jb27_les04.main;
import java.util.Scanner;
import java.util.Random;

public class SumOfDevidedByK {
	public static void main(String[] args) {
		int[] mas=new int[10];
		int k;
		int sum=0;
		enterArrayWithRandom(mas);
		printArray(mas);
		k=Kratnoe();
		sum=Summa(mas, k);
		printResult(sum);
	}
	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i=0; i<mas.length; i++) {
			mas[i]=rand.nextInt(100);
		}
	}
	
	public static void printArray(int[] mas) {
	System.out.println("-------------------------");
	for (int i=0; i<mas.length; i++) {
		System.out.print("mas[" +i+ "]=" +mas[i] +"; ");
	   }
	System.out.println();
	System.out.println("-------------------------");
	
	}
	
	public static int Kratnoe() {
		Scanner sc=new Scanner(System.in);
		int k;
		System.out.println ("Enter k: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println ("Enter valid k: ");
		   }
		k=sc.nextInt();
		return k;
	}
	
	public static int Summa(int[] mas, int k) {
		int sum=0;
		for (int i=0; i<mas.length; i++) {
			if (mas[i] % k==0) {
				sum=sum+mas[i];
			}
		}
		return sum;
	}
	
	public static void printResult(int sum) {
		System.out.println("Sum of devided by k = "+sum);
	}
}
