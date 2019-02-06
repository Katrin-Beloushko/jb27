package by.cdp.jb27_les06.main;

import java.util.Arrays;

public class Student {

	private String name;
	private int[] marks;
	private double avgMark;

	public Student() {
		
	}
	
	public Student (String name, int[] marks) {
		this.name = name;
		this.marks = marks;
		this.avgMark = avgMark;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	
	public void setMarks (int[] marks) {
		this.marks = marks;
		
	}
	
	public void setAvgMark (double avgMark) {
		this.avgMark = avgMark;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int[] getMarks() {
		return marks;
	}
	
	public int getMarks(int i) {
		return marks[i];
	}
	
	public double getAvgMark() {
		return avgMark;
	}
	
	
	 public double avgMark () {
		 double sum = 0;
		 double avgMark;
			for (int i=0; i<marks.length; i++) {
				sum = sum+marks[i];
			}
		
			avgMark = sum/marks.length;
			return avgMark;
		}
	 
	 
	
	 	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avgMark);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avgMark) != Double.doubleToLongBits(other.avgMark))
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name = " + name + ", marks = " + Arrays.toString(marks) + ", avgMark = " + avgMark + "]";
	}

	
	
	
	
}
