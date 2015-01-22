package week05;

import java.util.ArrayList;

/**
 * Purpose: To serve as a basic class to store Player's names and scores for any game.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/15/2015 at 2:51 PM.
 */
public class Player {
    private String playerName;
    private int playerScore;

    public String getPlayerName(){
        return this.playerName;
    }
    public void setPlayerScore(int playerScore){
         this.playerScore = playerScore;
    }
    public int getPlayerScore(){return this.playerScore;}

    public Player(String playerName){
        this.playerName = playerName;
        this.playerScore = 0;
    }
}
