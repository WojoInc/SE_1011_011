package week06;

import java.util.Scanner;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/11/2015 at 9:59 PM
 */
public class PcDesign {
    private long ramSize= (long) 1000000000.0;
    private long diskSize;
    private String processor;
    private double cost;

    public void assignRamSize()
    {
        this.ramSize = (long) 2000000000.0;
    }
    public void assignDiskSize()
    {
        Scanner stdIn = new Scanner(System.in);
        long diskSize;
        diskSize = stdIn.nextLong();
    }
    public void assignProcessor(){
        Scanner stdIn = new Scanner(System.in);
        this.processor = stdIn.nextLine();
    }
    public void calculateCost(){
        this.cost = this.ramSize / 10000000.0 + this.diskSize / 100000000.0;
        if(this.processor.equals("Intel")){
            this.cost+=400;
        }
        else{
            this.cost+=300;
        }
    }
    public void printSpecification(){
        System.out.println("RAM = " + this.ramSize);
        System.out.println("Hard disk size = " + this.diskSize);
        System.out.println("Processor = " + this.processor);
        System.out.println("Cost = $" + this.cost);
    }
}
