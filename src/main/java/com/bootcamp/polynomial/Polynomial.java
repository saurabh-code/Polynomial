package com.bootcamp.polynomial;

import java.util.HashMap;

public class Polynomial {

    HashMap<Integer,Integer> Poly = new HashMap<>();

    public void addToPoly(String s){
        String temp = new String();
        temp = s;
        String [] arrStr = temp.split("y");
        int size = arrStr.length;
        int key,value;
        if (size > 1) {
            key = Integer.parseInt(arrStr[1]);
            value = Integer.parseInt(arrStr[0]);
        }
        else{
            key = 0;
            value = Integer.parseInt(arrStr[0]);

        }
        Poly.put(key,value);
    }

    public void PrintHashMap(){
        System.out.print(Poly);
    }

    public Polynomial(String s){
        String temp = new String();
        temp = s;
        temp = temp.replace("-","+-");
        temp = temp.replace("x^","y").replace("x","y1");
        System.out.println(temp);
        String [] arrStr = temp.split("\\+");
        for ( String str : arrStr) {
            addToPoly(str);
        }
    }

    public static void main(String[] args){
        Polynomial a1 = new Polynomial("3x+4x^2-2");
        a1.PrintHashMap();
    }
}
