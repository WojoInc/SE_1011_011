package week03;

import java.util.Scanner;

/**
 * Purpose:
 *
 * @author:Owner
 * @version: 1.1
 * <p/>
 * Created by Owner on 1/9/2015 at 6:55 PM.
 */
public class ProductEvenInts {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int i, num, product;
        System.out.print("Enter a positive even number: ");
        num = stdIn.nextInt();
        product = 1;
        for(i=2; i <= num; i= i+2){
            product *= i;
        }

        System.out.println("Product = " + product);
    }
}
