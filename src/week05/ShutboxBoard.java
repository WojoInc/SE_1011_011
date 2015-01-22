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

    public void removeTiles(int die) {
        if (tiles.contains(die)) {
            tiles.remove(tiles.indexOf(die));
        }
    }
    public int queryTiles(int die){
        if (tiles.contains(die) == true){
            return 0;
        }
        else{
            return 1;
        }
    }
    public ArrayList<Integer> getRemainingTiles(){
        return this.tiles;
    }
    public int calcScore(){
        int score = 0;
        for(int i =0; i<tiles.size()-1; i++){
            score = score + tiles.get(i);
        }
        return score;
    }

    public ShutboxBoard(){
        for(int i=0; i<12; i++){
            this.tiles.add(i+1);
        }

    }
}
