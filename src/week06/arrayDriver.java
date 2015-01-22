package week06;
import week04.Banner;
import week05.Cube;

import javax.swing.*;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/21/2015 at 2:59 PM.
 */
public class arrayDriver {
    public static void displayCubes(Cube[] cubes){
        for(int i=0; i<cubes.length; i++){
            System.out.println("Cube Name: " + cubes[i].getPlayerName() + " Cube Color: " + cubes[i].getCubeColor());
        }
    }
    public static Cube[] getInput(){
        String userInput;
        String playerName;
        String cubeColor;
        userInput = JOptionPane.showInputDialog("Please input the number of cubes you would like to instantiate");
        Cube [] cubes;
        cubes = new Cube[Integer.parseInt(userInput)];
        for(int i =0; i< cubes.length; i++){
            playerName = JOptionPane.showInputDialog("Please input the name of the cube:");
            cubeColor = JOptionPane.showInputDialog("Please input the color of the cube:");
            cubes[i] = new Cube(playerName,20,cubeColor);
        }
        return cubes;
    }
    public static void main(String[] args) {
        Cube[] myCubes;
        myCubes = getInput();
        displayCubes(myCubes);

    }
}
