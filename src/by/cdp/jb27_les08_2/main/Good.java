package by.cdp.jb27_les08_2.main;

public class Good {

	private String name;
	private int price;
	private String color;
	
	public Good (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Good (String name, String color, int price) {
		this.name = name;
		this.color=color;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice () {
		return price;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		Good other = (Good) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Good [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

	
	
}
