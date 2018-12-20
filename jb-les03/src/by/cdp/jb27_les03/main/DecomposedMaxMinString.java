package by.cdp.jb27_les03.main;

import java.util.Scanner;

public class DecomposedMaxMinString {
	public static void main(String[] args) {
	  int k=qtyOfStr();
	  String[] ar=new String[k];
	  enterString(ar, k);
	  String min=minLine(ar, k);
	  String max=maxLine(ar, k);
	  printResult(min,max);
	  
	}
		
		public static int qtyOfStr() {
			Scanner sc=new Scanner(System.in);
			int k=0;
			System.out.print ("Enter k: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Enter valid k: ");
			}
			k=sc.nextInt();
			return k;
		}
				
		public static void enterString(String[] ar, int k) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < k; i++) {
				  int index=i+1;
			      System.out.print("Enter line number "+index+"> ");
			      if (sc.hasNextLine()) {
			    	     ar[i] = sc.nextLine();
			               }
			      }
			}
				
		public static String minLine(String[] ar, int k) {
			String min = ar[0];
			for (int i=1; i<k; i++) {
				if (ar[i].length()< min.length()) {
					min = ar[i];
			         }
		         }
			return min;
		}
				
		public static String maxLine(String[] ar, int k) {
			String max = ar[0];
			for (int i=1; i<k; i++) {
				if (ar[i].length()> max.length()) {
					max = ar[i];
			         }
		         }
			return max;
		}
		
		public static void printResult(String min, String max) {
			System.out.println("\nmax string = " +"\""+ max + "\" with length=" + max.length());
			System.out.println("min string = " +"\""+ min + "\" with length=" + min.length());
		}
			
}
