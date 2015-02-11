package week09;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 2/11/2015 at 3:33 PM.
 */
public class Truck extends Vehicle {
    private String engineType;

    @Override
    public String toString() {
        return getModelYear()+" "+getMake()+" "+getModel() + " " + engineType;
    }
    public String getEngineType(){
        return engineType;
    }
    public Truck(String make, String model, String color, String engineType,int modelYear) {
        super(make, model, color, modelYear);
        this.engineType = engineType;
    }
}
