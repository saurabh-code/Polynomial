package com.bootcamp.polynomial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolyUtil {


    public static Polynomial addPolynomial(Polynomial s1,Polynomial s2) {
        List<Integer> p1 = s1.getValue();
        List<Integer> p2 = s2.getValue();
        List<Integer> p3 = new ArrayList<>(Collections.nCopies(100, 0));

        for (int i = 0; i < 100; i++) {
            p3.set(i,p1.get(i) + p2.get(i));
        }
        return new Polynomial(p3);
    }

    public static Polynomial Multiply(Polynomial p1, Polynomial p2){
        List<Integer> poly1 = p1.getValue();
        List<Integer> poly2 = p2.getValue();
        List<Integer> result = new ArrayList<>(Collections.nCopies(200,0));

        for(int i=0;i<100;++i){
            for(int j=0;j<100;++j){
                result.set(i+j,result.get(i+j) + (poly1.get(i) * poly2.get(j)) );
            }
        }
        return new Polynomial(result);
    }

}
