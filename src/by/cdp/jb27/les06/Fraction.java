package by.cdp.jb27.les06;
public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		this.den = den;
	}

	public int getNum() {
		return num;
	}
	
	public int getDen() {
		return den;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + den;
		result = prime * result + num;
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
		Fraction other = (Fraction) obj;
		if (den != other.den)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}
	
	
}
