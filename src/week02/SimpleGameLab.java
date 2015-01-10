package week02;

/**
 * SE 1011 011
 * Purpose: To generate a random number for the player to guess while keeping track of the players
 * number of correct guesses as well as the number of guesses left.
 * When the user enters a guess the program should be able to give output telling the user whether the
 * guess was high/low/correct
 *
 * @author wesolowskitj
 * @version 1.0 created on 12/10/2014 at 8:18 AM
 */

import javax.swing.*;
import java.util.Random;


public class SimpleGameLab {
    public static void main(final String args[]) {
        //init local variables
        int guessesLeft = 3;
        int playerGuess = 0;
        int playerScore = 0;
        String inputString = "";

        //randomly generate a number and assign it to a variable for later use
        Random generator = new Random();
        int randInt = generator.nextInt(10) + 1; //give it a range [1 , 10]
        System.out.println(randInt); //to test if the generator gives intended results

        //display initial prompt to the user and grab user input
        inputString = JOptionPane.showInputDialog(null, "I'm thinking of a number between 1 and 10. What is it? You have "
                + guessesLeft + " guess(es) left.");
        playerGuess = Integer.parseInt(inputString);

        while(guessesLeft > 1) { //keep the program running so long as there are guesses left
            if (playerGuess < randInt) {//players guess to low
                guessesLeft--;// decrement guesses left
                inputString = JOptionPane.showInputDialog(null, "Incorrect, your guess was too low. Try again! You have "
                        + guessesLeft + " guess(es) left.");
                playerGuess = Integer.parseInt(inputString);
            }
            if (playerGuess > randInt){//players guess to high
                guessesLeft--;//decrement guesses left
                inputString = JOptionPane.showInputDialog(null, "Incorrect, your guess was too high. Try again! You have "
                        + guessesLeft + " guess(es) left.");
                playerGuess = Integer.parseInt(inputString);
            }
            if (playerGuess == randInt){//players guess is correct
                guessesLeft++;//increment guesses left
                playerScore++;//increment players score
                randInt = generator.nextInt(10) + 1;//generate new integer for player to guess
                System.out.println(randInt); //to test if the generator gives intended results
                inputString = JOptionPane.showInputDialog(null, "Well done! Try to guess another! You have "
                        + guessesLeft + " guess(es) left.");
                playerGuess = Integer.parseInt(inputString);

            }
        }
        JOptionPane.showMessageDialog(null, "Your score is: " + playerScore + ". Thanks for playing!");
    }
}
