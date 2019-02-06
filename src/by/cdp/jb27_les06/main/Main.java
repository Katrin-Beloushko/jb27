package by.cdp.jb27_les06.main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		
	Group group = new Group();
		
		
	Student student1 = new Student ("Ivanov", new int[] {2,5,4,5,6});
	    student1.setAvgMark(student1.avgMark());
	    
	Student student2 = new Student("Petrov", new int[] {5,5,5,5,5});
	    student2.setAvgMark(student2.avgMark());
	    
	Student student3 = new Student ("Sidorov", new int[] {4,5,2,3,5});
	    student3.setAvgMark(student3.avgMark());
	
	Student student4 = new Student ("Vetrov", new int[] {4,5,2,2,5});
	    student4.setAvgMark(student4.avgMark());
	    
	Student student5 = new Student ("Malinin", new int[] {5,5,2,5,5});
	    student5.setAvgMark(student5.avgMark());
	    
	Student student6 = new Student ("Pirogov", new int[] {5,5,5,5,5});
	    student6.setAvgMark(student6.avgMark());	
	    
	    
			
		group.add(student1);
		group.add(student2);
		group.add(student3);
		group.add(student4);
		group.add(student5);
		group.add(student6);
		
	
		
		System.out.println ("List of students with average mark for each student:\n ");
		for (int i=0; i<group.size(); i++) {
			System.out.println(group.getGroup().get(i));
		}
		
		group.groupAvgMark();
		group.qtyOfBest();
		group.qtyWith2();
		
		
	}
	


}


