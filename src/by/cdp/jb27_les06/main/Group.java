package by.cdp.jb27_les06.main;

import java.util.ArrayList;
import java.util.List;

public class Group {

	 private List<Student> group = new ArrayList<Student>(); 
	 
	 public Group() {
		 
	 }
	 
	 public List<Student> getGroup(){
		 return group;
	 }
	 
	 public void add(Student student) {
		 group.add(student);
	 }
	 
	 
	 public int size() {
		 return group.size();
	 }
	 
	 
	
	public int qtyOfBest () {
		 int qty = 0;
	for(Student st: group)	 {
		if (st.avgMark() ==5.0) {
			 qty++;
		}
	}
	System.out.println("\nQuantity of the best students (wih 5 on all exams) = " + qty); 
	return qty;
}
	 
	 public int qtyWith2() {
		 int qty = 0;
		 for(Student st: group)	 {
			 int i=0;
			 while (i<st.getMarks().length) {
				 if (st.getMarks(i)==2) {
					 qty++;
					 break;
				 } 
				 else {
					 i++;
				 }
			 }
				
			 
		 }
		 System.out.println("\nQuantity of students with 2-mark = " + qty); 
		 return qty;
	 }
	 
	 
	 
	 public double groupAvgMark() {
		 double sum=0;
		 double groupAvgMark;
		 for(Student st: group)	 {
		 int i=0;
		 while (i<st.getMarks().length) {
			 sum = sum + st.getMarks(i);
			 i++;
		 }
	 }
		 groupAvgMark = sum/group.size();
		 System.out.println("\nAverage mark for the whole group = " +groupAvgMark);
		 return groupAvgMark;
	 }
	 
	 
		
}
