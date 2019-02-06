package by.cdp.jb27_les12;




public class Book {
	
	private String author;
	private String name;
	private int yearPublished;
	private int price;
	
	public Book () {
		
	}
	
	public Book (String author, String name, int yearPublished, int price) {
		this.author = author;
		this.name = name;
		this.yearPublished = yearPublished;
		this.price = price;
	}
	
	public void setAuthor(String author){
		this.author = author;  
		}
	
	public String getAuthor() {
		return author;
	}
	
	public void setName(String name){
		this.name = name;  
		}
	
	public String getName() {
		return name;
	}
	
	public void setYearPublished(int yearPublished){
		this.yearPublished = yearPublished;  
		}
	
	public int getYearPublished() {
		return yearPublished;
	}
	
	public void setPrice(int price){
		this.price = price;  
		}
	
	public int getPrice() {
		return price;
	}

	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
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
		return "Book [" + author + " | " + name + " | published in " + yearPublished + " | " + price + "$ ]";
	}
	
	
	
	}