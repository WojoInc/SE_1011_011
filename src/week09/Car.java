package week09;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 2/11/2015 at 3:11 PM.
 */
public class Car extends Vehicle {

    @Override
    public String toString() {
        return getModelYear()+" "+getMake()+" "+getModel()+" in "+getColor();
    }

    public Car(String make, String model, String color, int modelYear) {
        super(make, model, color, modelYear);
    }
}
