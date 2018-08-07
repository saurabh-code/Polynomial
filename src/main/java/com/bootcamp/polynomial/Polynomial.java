package com.bootcamp.polynomial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Polynomial {

    private Map<Integer,Integer> poly = new HashMap<>();

    public Polynomial(String s){
        List<String> arrStr = Arrays.asList(normalizeString(s)
        										.split("\\+"));
        for (String smallPoly : arrStr) {
        		if (!smallPoly.isEmpty()) {
        			addToPoly(smallPoly);
        		}
        }
    }
    
    public Polynomial(Map<Integer, Integer> poly) {
		super();
		this.poly = poly;
	}

	public void addToPoly(String s){
        List<String> smallPolySplit = Arrays.asList(s.split("y"));
        int key = this.getPower(smallPolySplit);        
        int value = this.getCoef(smallPolySplit);
        poly.put(key,value);
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
    
    public Map<Integer, Integer> getValue() {
    		return poly;
    }
}
