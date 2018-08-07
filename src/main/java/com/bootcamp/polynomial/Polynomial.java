package com.bootcamp.polynomial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Polynomial {

    private List<Integer> poly;

    public Polynomial(String s){
    		this.poly = this.getEmptyList();
    	
        List<String> arrStr = Arrays.asList(normalizeString(s)
        										.split("\\+"));
        for (String smallPoly : arrStr) {
        		if (!smallPoly.isEmpty()) {
        			addToPoly(smallPoly);
        		}
        }
    }
    
    public Polynomial(List<Integer> poly) {
		super();
		this.poly = poly;
	}

	public void addToPoly(String s){
        List<String> smallPolySplit = Arrays.asList(s.split("y"));
        int key = this.getPower(smallPolySplit);        
        int value = this.getCoef(smallPolySplit);
        poly.set(key,value);
    }
    
    private String normalizeString (String s) {
    		return s.replaceAll("\\s", "")
		    		 .replaceAll("-", "+-")
		    		 .replaceAll("x\\^", "y")
		    		 .replaceAll("x", "y1");
    }
    
    private Integer getCoef(List<String> s) {
    		return Integer.parseInt(s.get(0));
    }
    
    private Integer getPower(List<String> s) {
    		if (s.size() > 1) {
    			return Integer.parseInt(s.get(1));
    		} else {
    			return 0;
    		}
    }
    
    private List<Integer> getEmptyList() {
    		Integer[] n = new Integer[100];
    		Arrays.fill(n, 0);
    		return Arrays.asList(n);
    }
    
    public List<Integer> getValue() {
    		return poly;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.poly.size(); i++) {
            int val = this.poly.get(i);
            if (val < 0) {
                sb.append(" " + val + "x^" + i);
            } else if (val > 0) {
                sb.append(" + " + val + "x^" + i);
            }
        }
        return sb.toString();
    }


}
