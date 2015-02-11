package week09;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 2/11/2015 at 3:04 PM.
 */
public class Vehicle {
    private String make;
    private String model;
    private int modelYear;
    private String color;
    private String licenseNumber;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String toString(){
        return modelYear + " " + make + " " + model;
    }

    public Vehicle(){
        new Vehicle("","","",0);
    }
    public Vehicle(String make, String model, String color, int modelYear) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.modelYear = modelYear;
    }
}
