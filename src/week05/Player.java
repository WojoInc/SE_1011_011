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

    public int[] getDice(){
        int[] diceValues = {die1.getFaceUp(),die2.getFaceUp()};
        return diceValues;
    }
    public String getPlayerName(){
        return this.playerName;
    }

   /*public void calcScore(){
        ArrayList<Integer> tilesLeft = playerBox.getRemainingTiles();
        for(int i=0; i< tilesLeft.size()-1; i++){
            playerScore = playerScore + tilesLeft.get(i);
        }

    }*/
    public void setPlayerScore(int playerScore){
         this.playerScore = playerScore;
    }
    public Player(String playerName){
        this.playerName = playerName;
    }
}
