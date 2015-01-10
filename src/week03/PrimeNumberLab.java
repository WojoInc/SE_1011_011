package week03;

/**
 * Purpose:
 * <p/>
 * <p/>
 * Created by Owner on 12/18/2014 at 12:20 AM.
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrimeNumberLab {

    public static void getInput(){
        String userString = "";
        userString = JOptionPane.showInputDialog("Please input a number: ");
        int output = 0;
        output = sieve(Integer.parseInt(userString));
        JOptionPane.showMessageDialog(null,"There are " + output + " primes.");
    }
    public static int sieve(int userInput){
        //create an arraylist that includes all numbers between 0 and the user entered number

        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 0; i < userInput; i++){
            //System.out.println(i);
            primes.add(i);
        }
        //start timer
        float startTime = System.nanoTime();

        /*follow the process of the "Sieve of Eratosthenes"
        begin with the the first prime, 2, and delete every multiple of the prime from the array,
        then move on to the next number in the array and repeat until the prime number you reach is equal
        to that of the square root of the user inputted number.
        */
        int currentPrime = 2;
        for (int j = 2; j < Math.sqrt(userInput); j++){
            int currentMultiple = 2;
            //get the value of the next prime in the array
            currentPrime = primes.get(j);
            //remove all multiples of the prime
            while ((currentPrime * currentMultiple) < userInput){

                if(primes.contains(currentPrime * currentMultiple)) {

                    primes.remove(primes.indexOf(currentPrime * currentMultiple));

                }
                currentMultiple++;

            }
        }

        //end timer and print time in milliseconds
        float endTime = System.nanoTime();
        float duration = (endTime - startTime) / 1000000;
        System.out.println(duration + " milliseconds");

        //remove 0 from the array as it was an offset and then return the size of the arraylist
        //which at this point contains only primes
        primes.remove(primes.indexOf(0));
        return primes.size();
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome, this program will determine the number of "
        + "primes between 0 and a number you input. Including 1.");
        getInput();

    }
}
