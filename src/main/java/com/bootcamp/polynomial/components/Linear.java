package com.bootcamp.polynomial.components;

public class Linear {
	
	private final int coeffOfX;
	private final int constant;
	
	public Linear(int coeffOfX, int constant) {
		super();
		this.coeffOfX = coeffOfX;
		this.constant = constant;
	}
	
	public Linear add (Linear c) {
		return new Linear(c.coeffOfX + this.coeffOfX, c.constant + this.constant);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linear other = (Linear) obj;
		if (coeffOfX != other.coeffOfX)
			return false;
		if (constant != other.constant)
			return false;
		return true;
	}
	
	
	
}
