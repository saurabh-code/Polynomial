package com.bootcamp.polynomial.components;

public class Constant {

	private final int constant;

	public Constant(int constant) {
		super();
		this.constant = constant;
	}
	
	public int getValue() {
		return this.constant;
	}
	
	public Constant add(Constant c) {
		return new Constant(this.constant + c.getValue());
	}
}
