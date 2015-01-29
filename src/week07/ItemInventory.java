package week07;

import javax.swing.*;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/29/2015 at 2:10 PM.
 */
public class ItemInventory {
    private String itemName = null;
    private int itemNumber = 0;
    private double unitPrice = 0.0;

    public void addShipment(int numberAdd){
        this.itemNumber+= numberAdd;
    }
    public int removeSold(int numberRemove) {
        int numberRemoved =0;
        if(numberRemove <= itemNumber){
            itemNumber-= numberRemove;
            numberRemoved = numberRemove;
        }
        else{
            itemNumber = 0;
            numberRemoved = itemNumber;
            JOptionPane.showMessageDialog(null,"You have run out of: " + this.itemName + "s.");
        }
        return numberRemoved;
    }
    public double getCurrentInventoryValue(){
        return (itemNumber * unitPrice);
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getItemNumber(){
        return this.itemNumber;
    }
    public double getItemUnitPrice(){
        return this.unitPrice;
    }

    /**
     * the default constructor with no items sets items to java defaults
     */
    public ItemInventory(){

    }

    /**
     *
     * @param theItemName
     * @param theItemNumber
     * @param theUnitPrice
     */
    public ItemInventory(String theItemName, int theItemNumber, double theUnitPrice){
        this.itemName = theItemName;
        this.itemNumber = theItemNumber;
        this.unitPrice = theUnitPrice;
    }

}
