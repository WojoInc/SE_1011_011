package week05;

import java.util.Random;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/14/2015 at 3:21 PM.
 */
public class Cube {
    private String playerName;
    private String cubeColor;
    private int faceUp;
    private int numFaces;

//get methods
    public String getCubeColor(){
        return this.cubeColor;
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public int getNumFaces(){
        return this.numFaces;
    }
    public int getFaceUp(){
        return this.faceUp;
    }
    public void setFaceUp(int input){this.faceUp = input;}
//class methods
    public void roll(){
        Random generator = new Random();
        this.faceUp = generator.nextInt(this.numFaces) + 1;
    }

//constructors
    public Cube(String playerName, int numFaces){
        this.playerName = playerName;
        this.numFaces = numFaces;
    }
    public Cube(String playerName, int numFaces, String cubeColor){
        this.playerName = playerName;
        this.numFaces = numFaces;
        this.cubeColor = cubeColor;
    }
}
