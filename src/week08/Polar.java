package week08;

import java.text.DecimalFormat;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 2/6/2015 at 7:54 PM.
 */
public class Polar {
    private double radians;
    private double magnitude;
    private double degrees;

   /*public Polar(double degrees, double amplitude){
        this.degrees = degrees;
        this.amplitude = amplitude;
        this.radians = getRadians();
    }*/
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
        output = "Vector magnitude: " + DF.format(magnitude) + " at " + degrees + " degrees.";
        return output;
    }
}
