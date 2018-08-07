package com.bootcamp.polynomial;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Polynomial p1 = new Polynomial("3x+1");
        Polynomial p2 = new Polynomial("4x^2-2x+4");
        System.out.println(PolyUtil.addPolynomial(p1,p2));
        System.out.println(PolyUtil.Multiply(p1,p2));
    }

}
