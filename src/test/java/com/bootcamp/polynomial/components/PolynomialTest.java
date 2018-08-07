package com.bootcamp.polynomial.components;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.bootcamp.polynomial.Polynomial;

public class PolynomialTest {

	private Integer[] expected = new Integer[100];
	
	@Before
	public void setup() {
		Arrays.fill(expected, 0);
	}
	
	@Test
	public void testConstant() {
		Polynomial p = new Polynomial("3");
		
		List<Integer> expected = Arrays.asList(this.expected);
		expected.set(0, 3);
		
		assertEquals(expected, p.getValue());
	}
	
	@Test
	public void testLinear() {
		Polynomial p = new Polynomial("3 + 3x");
		
		List<Integer> expected = Arrays.asList(this.expected);
		expected.set(0, 3);
		expected.set(1, 3);

		assertEquals(expected, p.getValue());
	}
	
	@Test
	public void testLinearWithSub() {
		Polynomial p = new Polynomial("3 - 3x");
		
		List<Integer> expected = Arrays.asList(this.expected);
		expected.set(0, 3);
		expected.set(1, -3);

		assertEquals(expected, p.getValue());
	}
	
	@Test
	public void testQuad() {
		Polynomial p = new Polynomial("-3x + 4x^2 -3");
		
		List<Integer> expected = Arrays.asList(this.expected);
		expected.set(0, -3);
		expected.set(1, -3);
		expected.set(2, 4);
		
		assertEquals(expected, p.getValue());
	}

}
