package exclude;

import javax.swing.*;
import java.util.ArrayList;
import week04.Banner;
import week05.Player;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/15/2015 at 2:49 PM.
 */
public class ShutboxGame {
    public static ArrayList<Player> configurePlayers(){
        //get number of players and set each one with a name and return a container of players.
        ArrayList<Player> players = new ArrayList<Player>();
        int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of players."));

        for(int i=1; i <= numPlayers; i++){
            String playerName = JOptionPane.showInputDialog("Please enter the name of Player" + i +".");
            Player player = new Player(playerName);
            players.add(player);
        }
        return players;
    }
    private static int promptPlayer(int die1, int die2, String playerName, ArrayList<Integer> remainTiles){
        String userInput;
        userInput = JOptionPane.showInputDialog(null,"Your remaining numbers: " + remainTiles + "You rolled a " + die1 + " and a "
               + die2 + " Please type the number you would like to remove",playerName,1);

        return Integer.parseInt(userInput);

    }
    public static ArrayList<Player> mainGame(ArrayList<Player> players){

        for(int i=0; i<=players.size()-1; i++){
            Player currentPlayer = players.get(i);
            ShutboxBoard currentBoard = new ShutboxBoard();
            String playerName = currentPlayer.getPlayerName();
            int currentNumber = 0;
            currentPlayer.nextTurn();
            while (currentPlayer.getDice(0) != 0 || currentPlayer.getDice(1) != 0){
                if(currentBoard.queryTiles(currentPlayer.getDice(0))==0 || currentBoard.queryTiles(currentPlayer.getDice(1)) ==0) {
                    currentNumber = promptPlayer(currentPlayer.getDice(0), currentPlayer.getDice(1), playerName,
                            currentBoard.getRemainingTiles());
                    if (currentBoard.queryTiles(currentNumber) == 0) {//if number exists in remaining tiles
                        currentBoard.removeTiles(currentNumber);//remove that number tile
                        currentPlayer.diceUsed(currentNumber);//mark that die as "used"
                    } else {
                        currentNumber = promptPlayer(currentPlayer.getDice(0), currentPlayer.getDice(1), playerName,
                                currentBoard.getRemainingTiles());
                    }
                }
            }
            currentPlayer.setPlayerScore(currentBoard.calcScore());

        }

        return players;
    }
    public static void results(ArrayList<Player> players){
        String currentWinner = "";
        int currentScore = 0;
        for(int i =0; i<players.size()-1; i++){
            if(players.get(i).getPlayerScore() > currentScore){
                currentScore = players.get(i).getPlayerScore();
                currentWinner = players.get(i).getPlayerName();
            }
        }
        JOptionPane.showMessageDialog(null,"The winner is: " + currentWinner + ". Thanks for playing!");
    }
    public static void main(String[] args) {
        String description = "Description: Each player attempts to get the lowest score by removing numbers based on the rolling of "
                + "two dice.";
        String author = "wesolowskitj";
        ArrayList<Player> players;
        Banner welcomeBanner = new Banner("ShutBox Game", description, author);
        JOptionPane.showMessageDialog(null, welcomeBanner.getDescription(),welcomeBanner.getTitle(),1);
        players = mainGame(configurePlayers());
        results(players);

    }
}
