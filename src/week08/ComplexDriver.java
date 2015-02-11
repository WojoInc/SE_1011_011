package week08;

import week04.Banner;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 2/5/2015 at 2:26 PM.
 */
public class ComplexDriver {
    public static Banner test = new Banner("","","");
    public static void toStringTest(){
        test.setDescription("Testing toString() method: ");
        System.out.println(test.getDescription());
        Complex[] output = new Complex[6];
        output[0] = new Complex(0,0);
        output[1] = new Complex(0,1);
        output[2] = new Complex(1,0);
        output[3] = new Complex(0,-1);
        output[4] = new Complex(1,-1);
        output[5] = new Complex(-1,-1);
        for(int i=0; i <6; i++){
            System.out.println("Formatted number: " + output[i]);
        }

    }
    public static void distanceTest(){
        test.setDescription("Testing distance (to origin) method: ");
        System.out.println(test.getDescription());
        Complex[] output = new Complex[6];
        output[0] = new Complex(0,0);
        output[1] = new Complex(0,1);
        output[2] = new Complex(1,0);
        output[3] = new Complex(0,-1);
        output[4] = new Complex(1,-1);
        output[5] = new Complex(-1,-1);
        for(int i=0; i <6; i++){
            System.out.println("Distance to origin: " + output[i].distance());
        }

    }
    public static void distanceToTest(){
        test.setDescription("Testing distance between points: ");
        System.out.println(test.getDescription());
        Complex[] a = new Complex[3];
        Complex[] b = new Complex[3];
        a[0] = new Complex(0,2);
        a[1] = new Complex(4,0);
        a[2] = new Complex(2,-4);
        b[0] = new Complex(0,1);
        b[1] = new Complex(1,0);
        b[2] = new Complex(1,-1);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.println("The distance between: (" + a[i] + ") and (" + b[j] + ") is: " + a[i].distance(b[j]));
            }
        }

    }
    public static void addTest(){
        test.setDescription("Testing add method: ");
        Complex[] a = new Complex[3];
        Complex[] b = new Complex[3];
        a[0] = new Complex(0,1);
        a[1] = new Complex(1,0);
        a[2] = new Complex(1,-1);
        b[0] = new Complex(0,1);
        b[1] = new Complex(1,0);
        b[2] = new Complex(1,-1);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.println("Sum of: (" + a[i]+ ") + ("
                        +b[j]+") = " + a[i].add(b[j]));
            }
        }
    }
    public static void subTest(){
        test.setDescription("Testing subtraction method: ");
        Complex[] a = new Complex[3];
        Complex[] b = new Complex[3];
        a[0] = new Complex(0,1);
        a[1] = new Complex(1,0);
        a[2] = new Complex(1,-1);
        b[0] = new Complex(0,1);
        b[1] = new Complex(1,0);
        b[2] = new Complex(1,-1);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.println("Difference of: (" + a[i]+") - ("
                        +b[j]+ ") = " + a[i].subtract(b[j]));
            }
        }
    }
    public static void multiplyTest(){
        test.setDescription("Testing multiplication method: ");
        System.out.println(test.getDescription());
        Complex[] a = new Complex[3];
        Complex[] b = new Complex[3];
        a[0] = new Complex(3,-1);
        a[1] = new Complex(4,0);
        a[2] = new Complex(2,-4);
        b[0] = new Complex(0,1);
        b[1] = new Complex(1,0);
        b[2] = new Complex(3,1);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.println("The product of: (" + a[i] + ") x (" + b[j] + ") is (" + a[i].multiply(b[j])+ ").");
            }
        }
    }
    public static void divideTest(){
        test.setDescription("Testing division method: ");
        System.out.println(test.getDescription());
        Complex[] a = new Complex[3];
        Complex[] b = new Complex[3];
        a[0] = new Complex(4,2);
        a[1] = new Complex(4,0);
        a[2] = new Complex(2,-4);
        b[0] = new Complex(0,1);
        b[1] = new Complex(1,0);
        b[2] = new Complex(3,-1);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.println("The quotient of: (" + a[i] + ") / (" + b[j] + ") is (" + a[i].divide(b[j])+ ").");
            }
        }
    }
    public static void polarTest(){
        Complex test = new Complex(1,1);
        Complex test2 = new Complex(3.5,6);
        System.out.println(test.toPolar());
        System.out.println(test2.toPolar());
    }
    public static void main(String[] args) {
        toStringTest();
        distanceTest();
        distanceToTest();
        addTest();
        subTest();
        multiplyTest();
        divideTest();
        polarTest();
    }
}
