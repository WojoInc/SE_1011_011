package week05;

import java.util.ArrayList;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/15/2015 at 2:13 PM.
 */
public class ShutboxBoard {

    private ArrayList<Integer> tiles = new ArrayList<Integer>();

    public void removeTiles(int die1, int die2, int option){
        switch (option){
            case 0:
                if(tiles.contains((die1+die2))){
                tiles.remove(tiles.indexOf((die1+die2)));
            }
            case 1:
                if(tiles.contains(die1)){
                    tiles.remove(tiles.indexOf(die1));
                }
                if(tiles.contains(die2)){
                    tiles.remove(tiles.indexOf(die2));
                }
        }
    }
    public ArrayList<Integer> queryTiles(int die1, int die2){
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(tiles.contains(die1)){
            result.add(die1);
        }
        if(tiles.contains(die2)){
            result.add(die2);
        }
        if(tiles.contains((die1+die2))){
            result.add((die1 + die2));
        }
        return tiles;
    }
    public ArrayList<Integer> getRemainingTiles(){
        return this.tiles;
    }

    public ShutboxBoard(){
        for(int i=0; i<12; i++){
            this.tiles.add(i+1);
        }

    }
}
