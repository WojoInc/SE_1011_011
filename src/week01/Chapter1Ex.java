package week01;

/**
 * SE 1011 011
 * Purpose: To get an input from the user and display the input in a jFrame window.
 *
 * @author wesolowskitj
 * @version 1.0 created on 12/9/2014 at 11:37 PM
 */

import javax.swing.*;
import java.util.Scanner;

public class Chapter1Ex {
    public static void main(final String args[]) {
        //init scanner object and display message to user.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        JOptionPane.showMessageDialog(null,"You entered the number: " + input.nextInt());
    }
}
