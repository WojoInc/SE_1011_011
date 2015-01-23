package week06;
import week04.Banner;
import week05.Cube;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/21/2015 at 2:59 PM.
 */
public class arrayDriver {

    public static void displayDistribution(Cube[] cubes, double[] distribution){
        Cube refCube = cubes[0];
        int timesRolled = refCube.getTimesRolled(); //use a reference Cube to get the times rolled
        System.out.println("The likelyhood of rolling each number when rolling " + cubes.length +
        " cubes " + timesRolled + " times is as follows");
        DecimalFormat df = new DecimalFormat("##.##%");
        for(int i=0; i<refCube.getNumFaces() +1; i++){
            System.out.println(i + ": " + df.format(distribution[i]));
        }

    }
    public static Cube[] getInput(){
        String userInput;
        String cubeColor;
        Cube [] cubes;
        userInput = JOptionPane.showInputDialog("Please input the number of cubes you would like to instantiate");
        cubes = new Cube[Integer.parseInt(userInput)];
        userInput = JOptionPane.showInputDialog("Please input the number of sides you would like per cube");
        for(int i =0; i< cubes.length; i++){
            cubes[i] = new Cube("",Integer.parseInt(userInput),"");
        }
        return cubes;
    }
    public static double[] probability (Cube[] cubeArray){
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("How many rolls?"));
        Cube refCube = cubeArray[0];
        int[] probability = new int[refCube.getNumFaces() +1]; //uses the first cube object as a reference to get the number of sides
        double[] dprobability = new double[refCube.getNumFaces() +1];
        int totalRolls = 0;


        for(int i =0; i<cubeArray.length; i++){
            for(int j=0; j< userInput+1; j++) {
                cubeArray[i].roll();
                probability[cubeArray[i].getFaceUp()] = probability[cubeArray[i].getFaceUp()] + 1;
                totalRolls++;
            }
        }
        for(int i =0; i<probability.length; i++){
            dprobability[i] = ((double) probability[i]) / totalRolls;
        }
        return dprobability;
    }
    public static void main(String[] args) {
        Banner welcome = new Banner("ArrayPractice","This program will calculate the likelyhood of rolling a number\n"+
        "between 1 and 20 based on 100 rolls of as many dice as the user inputs.","wesolowskitj");
        JOptionPane.showMessageDialog(null,welcome.getDescription(),welcome.getTitle(),1);

        Cube[] myCubes;
        myCubes = getInput();
        double[] distribution = probability(myCubes);
        displayDistribution(myCubes, distribution);

    }
}
