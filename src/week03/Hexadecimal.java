package week03;

/**
 * Purpose:
 *
 * @author:Owner
 * @version: 1.1
 * <p/>
 * Created by Owner on 12/19/2014 at 10:26 AM.
 */
import javax.swing.*;
import java.util.Arrays;

public class Hexadecimal {


    public static char[] toHex(int[] inputArray){
        char [] hex = {'A','B','C','D','E','F'};
        char [] outputArray = new char[8];
        for(int i=7; i>=0; i--){
            if(inputArray[i] < 10){
                outputArray[i] = (char)(inputArray[i] + 48); //ascii table hexadecimal offset
            }
            else{
                outputArray[i] = hex[inputArray[i]-10];
            }
        }
        return outputArray;
    }
    public static int[] toNibble(int[] inputArray){

        int[] nibble = new int[8];
        int currentIndex = 31;
        int i = 0;
        int j = 7;
        int currentValue = 0;
        int binaryFactor = 0;
        while (j>=0){
            while (i <= 3){
                binaryFactor = (int) Math.pow(2,i);
                currentValue = currentValue + (inputArray[currentIndex - i] * binaryFactor);

                i++;
            }
            nibble[j]= currentValue;
            currentValue = 0;
            binaryFactor = 0;
            //if(currentIndex<5)
            currentIndex = currentIndex - i;
            i=0;
            j--;
        }
        return nibble;
    }
    public static int[] reverse(int[] inputArray){
        int temp = 0;
        for (int i = 0; i < 16; i++) {
            temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }
        return inputArray;
    }

    public static int[] toBinary(String inputNumber){
        int numberToConvert = Integer.parseInt(inputNumber);
        int[] binArray = new int[32];

        for(int i=0; i<32; i++){
            if(numberToConvert % 2 == 1){
                binArray[i] = 1;
            }
            numberToConvert = numberToConvert /2;

        }
        return binArray;
    }

    public static String getInput(){
        return JOptionPane.showInputDialog("Please input an integer: ");
    }
    public static void main(String[] args) {
        String userInput = getInput();
        int[] currentNumber = reverse(toBinary(userInput));
        char [] hexNumber = toHex(toNibble(currentNumber));

            //optional console printing.
            System.out.println(Arrays.toString(reverse(toBinary(userInput))));
            System.out.println();
            System.out.print("0x");
            System.out.print(hexNumber);

    }
}
