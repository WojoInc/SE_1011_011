package week04;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/10/2015 at 10:09 PM
 */
public class TownDriver {
    public static void main(String[] args) {
        Town newHome = new Town();
        newHome.initialize();
        newHome.simulateBirth();
        newHome.printStatistics();
    }
}
