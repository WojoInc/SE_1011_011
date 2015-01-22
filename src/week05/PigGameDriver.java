package week05;

import week04.Banner;

import javax.swing.*;

/**
 * Labs 1011-011
 * Purpose: This class serves as the driver for the PigGame class, and helps connect user input and the methods
 * of the PigGame class.
 *
 * @author wesolowskitj
 * @version 1.0 Created on 1/22/2015 at 1:01 AM
 */
public class PigGameDriver {
    /**
     * Gets all necessary inputs from the players to configure the game instance to their liking
     * before returning it for use in mainGame method.
     * @return an instance of class PigGame, configured and ready to be run by mainGame method.
     */
    public static PigGame initGame(){
        int numPlayers, maxInt, wildNum, numFaces;
        Player[] players;
        PigGame newGame;

        //get player inputs
        numPlayers = Integer.parseInt(JOptionPane.showInputDialog("How many players?"));
        maxInt = Integer.parseInt(JOptionPane.showInputDialog("What number would you like to play up to?"));
        wildNum = Integer.parseInt(JOptionPane.showInputDialog("What would you like the wild card number to be?"));
        numFaces = Integer.parseInt(JOptionPane.showInputDialog("Each player gets 2 dice. How many faces per die?"));

        players = new Player[numPlayers];

        for(int i =0; i<numPlayers; i++){
            players[i] = new Player(JOptionPane.showInputDialog("What is the name of Player " + (i+1) + "?"));
        }

        newGame = new PigGame(players,numFaces,maxInt,wildNum);

        return newGame;
    }

    /**
     * Main game method. Interfaces directly with the PigGame object and interacts with the user to control
     * decision statements and rotate through players.
     * @param currentGame the current instance of PigGame class to interface with.
     */
    public static void mainGame(PigGame currentGame){
        Player currentPlayer = currentGame.getCurrentPlayer();
        String userInput;
        boolean playerWon = false;
        currentGame.roll();

        while (playerWon == false) {
            userInput = JOptionPane.showInputDialog(currentPlayer.getPlayerName() + ", Your current turn sum is: " +
                    currentGame.getTurnSum() +
                    "\nand your current score is: " + currentPlayer.getPlayerScore() +
                    "\nWould you like to roll again (y) or hold? (n)");
            if (userInput.compareTo("y") == 0) {
                currentGame.roll();
                currentPlayer = currentGame.getCurrentPlayer();
            }

            else if (userInput.compareTo("n") == 0) {
                currentPlayer.setPlayerScore(currentPlayer.getPlayerScore() + currentGame.getTurnSum());
                playerWon = currentGame.playerWon();
                currentGame.nextPlayer();
                currentPlayer = currentGame.getCurrentPlayer();
                currentGame.roll();
            }
            else {
                userInput = JOptionPane.showInputDialog(currentPlayer.getPlayerName() + ", Your current turn sum is: " +
                        currentGame.getTurnSum() +
                        "\nand your current score is: " + currentPlayer.getPlayerScore() +
                        "\nWould you like to roll again (y) or hold? (n)");

            }
           playerWon = currentGame.playerWon();
        }
        JOptionPane.showMessageDialog(null, currentPlayer.getPlayerName() + " won with a score of: " + currentPlayer.getPlayerScore());
    }
    public static void main(String[] args) {
        //create banner instance
        Banner welcome = new Banner("Pig","Welcome. This game is based on the traditional game, Pig. "
                + "\nRules:\nEach player will have the opportunity to roll their dice in order to be the first one to reach the given number"
                + ". \nPlayers may continue to roll on their turn and add points to their turn total. \nHowever, any multiple of"
                + " the player's chosen number, the \"wild number\" will cause that player to lose \nall the points accumulated"
                + " during that turn. ","wesolowskitj");
        //display welcome message
        JOptionPane.showMessageDialog(null, welcome.getDescription(), welcome.getTitle(),1);
        JOptionPane.showMessageDialog(null, "Created by: " + welcome.getAuthor());
        //sets up and configures game instance, than passes instance to mainGame method to run it.
        PigGame currentGame = initGame();
        mainGame(currentGame);

    }
}
