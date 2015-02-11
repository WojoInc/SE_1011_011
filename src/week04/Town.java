package week04;

import javax.swing.*;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/10/2015 at 10:09 PM
 */
public class Town {
    private int numberOfAdults;
    private int numberOfChildren;

    public void initialize(){
        this.numberOfAdults = Integer.parseInt(JOptionPane.showInputDialog("How many adults to start with?: "));
        this.numberOfChildren = Integer.parseInt(JOptionPane.showInputDialog("How many children to start with?: "));
    }
    public void simulateBirth(){
        numberOfChildren+= 2;
    }
    public void printStatistics(){
        System.out.println("Number of Adults: " + numberOfAdults + " Number of Children: " + numberOfChildren);
    }
    public Town(){
        this.numberOfAdults = 0;
        this.numberOfChildren = 0;
    }
}
