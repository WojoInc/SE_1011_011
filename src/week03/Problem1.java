package week03;

import javax.swing.*;

/**
 * Labs 1011-011
 * Purpose: Calculate the number of stamps required to mail a given number of sheets
 *
 * @author wesolowskitj
 * @version 1.0 Created on 1/21/2015 at 9:57 PM
 */
public class Problem1 {
    public static int getInput(){
        int numSheets = Integer.parseInt(JOptionPane.showInputDialog("Please input the number of sheets you wish to mail."));
        return numSheets;
    }
    public static int calcStamps(int numSheets){
        int numStamps;
        numStamps = numSheets / 5;
        if (numSheets % 5 > 0){
            numStamps++;
        }
        return numStamps;

    }
    public static void main(String[] args) {
        int numSheets = getInput();
        int numStamps = calcStamps(numSheets);
        if (numStamps > 3){
            JOptionPane.showMessageDialog(null,"Don't Mail");
        }
        else{
            JOptionPane.showMessageDialog(null, "Use " + numStamps + " stamps.");
        }

    }
}
