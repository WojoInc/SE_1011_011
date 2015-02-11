package week06;
import java.util.Scanner;
/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/10/2015 at 11:26 PM
 */
public class Trig {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double angle = 0.0;
        System.out.println("Please enter an angle in degrees: ");
        angle = stdIn.nextDouble();
        System.out.println("sin(deg) = " + Math.sin(angle));
        System.out.println("cos(deg) = " + Math.cos(angle));
        System.out.println("tan(deg) = " + Math.tan(angle));
    }
}
