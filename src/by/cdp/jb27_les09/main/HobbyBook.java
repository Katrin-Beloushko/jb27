package by.cdp.jb27_les09.main;

public class HobbyBook extends Book{
	
	private String genre;
	
	public HobbyBook() {
		
	}
	
	public HobbyBook (String author, String name, int yearPublished, int price, String genre) {
		super(author, name, yearPublished, price);
		this.genre = genre;
	}
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	
	public String getGenre() {
		return genre;	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HobbyBook other = (HobbyBook) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HobbyBook [" + getAuthor() + " | " + getName()
				+ " | published in " + getYearPublished() + " | " + getPrice() + "$ | genre - " + genre+"]";
	}

	
		
	
}
