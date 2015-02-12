package week06;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/11/2015 at 10:11 PM
 */
public class PcDesignDriver {
    public static void main(String[] args) {
        PcDesign myPc = new PcDesign();
        myPc.assignRamSize();
        myPc.assignDiskSize();
        myPc.assignProcessor();
        myPc.calculateCost();
        myPc.printSpecification();
    }
}
