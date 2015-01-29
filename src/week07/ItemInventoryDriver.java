package week07;

import javax.swing.*;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/29/2015 at 2:36 PM.
 */
public class ItemInventoryDriver {
    public static String[] getInput(){
        int numItems;
        String[] output;
        numItems = Integer.parseInt(JOptionPane.showInputDialog("How many different items would you like to add?"));
        output = new String[numItems];
        for(int i=0; i<numItems; i++){
            output[i] = JOptionPane.showInputDialog("Please input the name of item " + i );
        }

        return output;
    }
    public static ItemInventory[] stockInventory(String[] itemNames){
        int itemNum=0;
        double itemUnitPrice=0.0;
        ItemInventory[] items = new ItemInventory[itemNames.length];
        for(int i=0; i<itemNames.length; i++){
            itemNum = Integer.parseInt(JOptionPane.showInputDialog("How many " + itemNames[i] + "s did you start with?"));
            itemUnitPrice = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the unit?"));
            ItemInventory currentItem = new ItemInventory(itemNames[i],itemNum,itemUnitPrice);
            items[i] = currentItem;
        }
        return items;

    }
    public static void printItems(ItemInventory[] items){
        for(int i=0; i<items.length; i++){
            ItemInventory currentItem = items[i];
            System.out.println(currentItem.getItemName());
            System.out.println("Qty: " + currentItem.getItemNumber());
            System.out.println("Unit Price: " + currentItem.getItemUnitPrice());
            System.out.println("Total Value: " + currentItem.getCurrentInventoryValue());
        }
    }
    public static ItemInventory[] removeStock(ItemInventory[] items){
        int numberToRemove = 0;
        for(int i=0; i<items.length; i++){
            ItemInventory currentItem = items[i];
            numberToRemove = Integer.parseInt(JOptionPane.showInputDialog("Were there any " + currentItem.getItemName() +"s sold?"));
            System.out.println("You removed: " + currentItem.removeSold(numberToRemove) + " " + currentItem.getItemName() + "(s) to inventory.");
        }
        return items;
    }
    public static ItemInventory[] addStock(ItemInventory[] items){
        int numberToAdd = 0;
        for(int i=0; i<items.length; i++){
            ItemInventory currentItem = items[i];
            numberToAdd = Integer.parseInt(JOptionPane.showInputDialog("Were there any " + currentItem.getItemName() +"s received?"));
            System.out.println("You added: " + currentItem.removeSold(numberToAdd) + " " + currentItem.getItemName() + "(s) to inventory.");
        }
        return items;
    }
    public static void main(String[] args) {
        String[] inputStrings = getInput();
        ItemInventory[] items = stockInventory(inputStrings);
        System.out.println("***Starting inventory***");
        printItems(items);
        items = removeStock(items);
        printItems(items);
        items = addStock(items);
        printItems(items);

    }
}
