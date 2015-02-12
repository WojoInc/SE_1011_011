package week06;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/11/2015 at 10:58 PM
 */
public class ZooDriver {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        String[] animals = {"pig","possum","squirrel", "Chihuahua"};
        Zoo zoo2 = new Zoo(animals, "Parkville");
        zoo1.display();
        zoo2.display();
    }
}
