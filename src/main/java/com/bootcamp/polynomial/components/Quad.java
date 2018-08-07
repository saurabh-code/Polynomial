package com.bootcamp.polynomial.components;

public class Quad {

	private final int coeffOfX2;
	private final int coeffOfX;
	private final int constant;
	
	public Quad(int coeffOfX2, int coeffOfX, int constant) {
		super();
		this.coeffOfX2 = coeffOfX2;
		this.coeffOfX = coeffOfX;
		this.constant = constant;
	}
	
	public Quad add(Quad c) {
		return new Quad(c.coeffOfX2 + this.coeffOfX2, 
						c.coeffOfX + this.coeffOfX,
						c.constant + this.constant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quad other = (Quad) obj;
		if (coeffOfX != other.coeffOfX)
			return false;
		if (coeffOfX2 != other.coeffOfX2)
			return false;
		if (constant != other.constant)
			return false;
		return true;
	}
	
	
	
}
