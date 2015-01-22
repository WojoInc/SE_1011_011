package week05;

import java.util.ArrayList;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/15/2015 at 2:51 PM.
 */
public class Player {
    private String playerName;
    private int playerScore = 0;
    //private ShutboxBoard playerBox = new ShutboxBoard();

    private Cube die1 = new Cube(this.playerName,6);
    private Cube die2 = new Cube(this.playerName,6);

    public void nextTurn(){
        die1.roll();
        die2.roll();

    }
    public void diceUsed(int input){
        if(input == die1.getFaceUp()){
            die1.setFaceUp(0);
        }
        else if(input == die2.getFaceUp()){
            die2.setFaceUp(0);
        }
        else if(input == die1.getFaceUp() + die2.getFaceUp()){
            die1.setFaceUp(0);
            die2.setFaceUp(0);
        }
    }
    public int getDice(int die){
        if(die == 0) {
            return die1.getFaceUp();
        }
        else {
            return die2.getFaceUp();
        }
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public void setPlayerScore(int playerScore){
         this.playerScore = playerScore;
    }
    public int getPlayerScore(){return this.playerScore;}

    public Player(String playerName){
        this.playerName = playerName;
    }
}
