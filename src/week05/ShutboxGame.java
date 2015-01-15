package week05;

import javax.swing.*;
import java.util.ArrayList;
import week04.Banner;

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
    public static void mainGame(ArrayList<Player> players){
        for(int i=0; i<=players.size()-1; i++){
            Player currentPlayer = players.get(i);
            currentPlayer.nextTurn();
            int[] diceValues = currentPlayer.getDice();
            System.out.println(currentPlayer.getPlayerName());
            System.out.println(diceValues[0]);
            System.out.println(diceValues[1]);
        }


    }
    public static void main(String[] args) {
        String description = "Description: Each player attempts to get the lowest score by removing numbers based on the rolling of "
                + "two dice.";
        String author = "wesolowskitj";
        Banner welcomeBanner = new Banner("ShutBox Game", description, author);
        JOptionPane.showMessageDialog(null, welcomeBanner.getDescription(),welcomeBanner.getTitle(),1);
        mainGame(configurePlayers());
    }
}
