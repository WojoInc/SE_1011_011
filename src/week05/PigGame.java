package week05;

import javax.swing.*;

/**
 * Labs 1011-011
 * Purpose: To serve as the backbone for the PigGame Lab. This class contains all the essential methods to run the game.
 *
 * @author wesolowskitj
 * @version 1.0 Created on 1/22/2015 at 1:26 AM
 */
public class PigGame {
    private Player[] players;
    private Cube die1;
    private Cube die2;
    private int maxInt;
    private int wildNum;
    private int currentPlayer;
    private int turnSum;
    private int rollSum;

    /**
     * Iterates through the players[] array by one, and loops around if the bound of the array is reached.
     * Also resets sums.
     */
    public void nextPlayer(){
        this.currentPlayer++;
        if(this.currentPlayer == players.length){
            currentPlayer = 0;
        }
        turnSum = 0;
        rollSum = 0;

    }

    /**
     * Rolls dice for the player, adds up sums and then checks if either die has hit the wild number.
     */
    public void roll(){
        die1.roll();
        die2.roll();
        rollSum = die1.getFaceUp() + die2.getFaceUp();
        turnSum = turnSum + rollSum;
        checkWild();

    }
    public int getRollSum(){
        return rollSum;
    }
    public int getTurnSum() { return turnSum; }
    public Player getCurrentPlayer(){
        return players[currentPlayer];
    }
    public boolean playerWon(){
        if(players[currentPlayer].getPlayerScore() >= maxInt){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Checks if either die is equal to the wild number and displays a jFrame message and moves to the nest player
     * and re-rolls if true.
     */
    private void checkWild(){
        if(die1.getFaceUp() == wildNum || die2.getFaceUp() == wildNum){
            JOptionPane.showMessageDialog(null,"You rolled a multiple"
            + " of the wild number. You have lost all points gained this turn. \nYour current score: "
            + players[currentPlayer].getPlayerScore());
            this.nextPlayer();
            this.roll();
        }
    }
public PigGame(Player[] players, int numFaces, int maxInt, int wildNum){
    this.players = players;
    this.die1 = new Cube(null,numFaces);
    this.die2 = new Cube(null,numFaces);
    this.maxInt = maxInt;
    this.wildNum = wildNum;
    this.currentPlayer = 0;
    this.turnSum = 0;
    this.rollSum = 0;

}
}
