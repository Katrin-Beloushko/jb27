package by.cdp.jb27_les09.main;

public class ProgrammingBook extends EducationBook{

	private String level;
	
	public ProgrammingBook() {
		
	}
	
	public ProgrammingBook (String author, String name, int yearPublished, int price, String subject, String level) {
		super(author, name, yearPublished, price, subject);
		this.level = level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getLevel () {
		return level;
	}

	@Override
	public String toString() {
		return "ProgrammingBook [" + getAuthor() + " | " + getName() + " | published in " + getYearPublished() + " | " + getPrice() + "$ | subject - " + getSubject() + " | level - " + getLevel() + " ]";
	}
	
	
}
