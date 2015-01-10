package week01;

/**
 * SE 1011 011
 * Purpose:
 * To practice the use of various inputs and outputs on both the java console as well as the jFrame GUI
 *
 * @author wesolowskitj
 * @version 1.0 created on 12/9/2014 at 10:37 PM
 */

import javax.swing.*;
import java.util.Scanner;

public class InputOutputLab {
    public static void main(final String args[]) {
        //Print to console
        System.out.println("Hello World on the Console!");
        //Print to jFrame
        JOptionPane.showMessageDialog(null,"Hello World on the Frame!");
        //Part 2 of lab
        //Init scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        System.out.println("You entered the integer: " + input.nextInt());

    }
}
