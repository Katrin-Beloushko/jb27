package by.cdp.jb27_les09.main;

public class EducationBook extends Book {

	private String subject;
	
	public EducationBook() {
		
	}
	
	public EducationBook (String author, String name, int yearPublished, int price, String subject) {
		super(author, name, yearPublished,price);
		this.subject = subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject () {
		return subject;
	}

	@Override
	public String toString() {
		return "EducationBook [" + getAuthor() + " | " + getName()
				+ " | published in " + getYearPublished() + " | " + getPrice() + "$ | subject - " + subject+"]";
	}

	
	

	

	
	
	
}
