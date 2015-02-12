package week08;

import java.text.DecimalFormat;

/**
 * Purpose:A class to represent Polar coordinates, also includes basic methods for working with polar coordinates.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * Created by wesolowskitj on 2/6/2015 at 7:54 PM.
 */
public class Polar {
    private double radians;
    private double magnitude;
    private double degrees;

    public Polar(double radians, double magnitude){
        this.radians = radians;
        this.magnitude = magnitude;
        this.degrees = getDegrees();
}
    public Polar(){
        new Polar(0.0,0.0);
    }
    public double getDegrees(){
        return radians * 180 /Math.PI;
    }
    public double getRadians(){
        return radians;
    }
    public double getMagnitude(){ return magnitude; }
    public String toString(){
        String output;
        DecimalFormat DF = new DecimalFormat("#.####");
        output = "Vector magnitude: " + DF.format(magnitude) + " at " + DF.format(degrees) + " degrees.";
        return output;
    }
}
