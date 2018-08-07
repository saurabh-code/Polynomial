package com.bootcamp.polynomial.components;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bootcamp.polynomial.Polynomial;

public class PolynomialTest {

	@Test
	public void testConstant() {
		Polynomial p = new Polynomial("3");
		
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(0, 3);
		
		assertEquals(expected, p.getValue());
	}
	
	@Test
	public void testLinear() {
		Polynomial p = new Polynomial("3 + 3x");
		
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(0, 3);
		expected.put(1, 3);

		assertEquals(expected, p.getValue());
	}
	
	@Test
	public void testLinearWithSub() {
		Polynomial p = new Polynomial("3 - 3x");
		
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(0, 3);
		expected.put(1, -3);

		assertEquals(expected, p.getValue());
	}
	
	@Test
	public void testQuad() {
		Polynomial p = new Polynomial("-3x + 4x^2 -3");
		
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(0, -3);
		expected.put(1, -3);
		expected.put(2, 4);
		
		assertEquals(expected, p.getValue());
	}

}
