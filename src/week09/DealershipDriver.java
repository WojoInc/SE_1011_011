package week09;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 2/11/2015 at 3:15 PM.
 */
public class DealershipDriver {
    public ArrayList<Vehicle> getInitialInventory(){
        String quit = "";
        while(quit.compareTo("q") == 0){

        }
        return null;
    }
    public static void main(String[] args) {
        Car chevy = new Car("Chevrolet","Camaro","Yellow",1975);
        Truck ford = new Truck("Ford","F-150","Black","Diesel",2007);
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();
        inventory.add(chevy);
        inventory.add(ford);
        System.out.println(chevy);
        System.out.println(ford);
    }
}
