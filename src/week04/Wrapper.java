package week04;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/10/2015 at 9:43 PM
 */
public class Wrapper {
    public static void main(String[] args) {
        double x = 44.5;
        double y = 44.5;
        Double xW = new Double(x);
        Double yW = new Double(y);

        System.out.println("object == object " + (xW==yW));
        System.out.println("value == value? " + (xW.doubleValue() == yW.doubleValue()));
        System.out.println("object.equals(object)? " + xW.equals(yW));
        System.out.println("object.compareTo(object)? " + xW.compareTo(yW));
        yW = new Double(y + 3.0);
        System.out.println("object.compareTo(largerobject)? " + xW.compareTo(yW));
        yW = new Double(Double.NEGATIVE_INFINITY);
        System.out.println("-infinity isInfinite? " + yW.isInfinite());


    }
}
