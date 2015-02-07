package week08;

/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * Created by wesolowskitj on 2/5/2015 at 2:05 PM.
 */
public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(){
        new Complex(0.0,0.0);
    }

    /**
     * adds any two complex numbers in the form Complex.add(input) where input is a Complex number
     * @param input a number represented by the class Complex to be added
     * @return a number represented by the class Complex, with a value representing the sum of the two complex number
     */
    public Complex add(Complex input){
        return new Complex(real + input.real, imaginary + input.imaginary);
    }

    /**
     * calculates the distance between a complex number and the origin
     * @return the distance
     */
    public double distance(){
        return Math.sqrt(real*real + imaginary*imaginary);
    }

    /**
     * calculates the distance between a complex number and another reference complex number
     * @param input the complex number to use as reference point
     * @return the distance between the complex number and the reference point
     */
    public double distance(Complex input){
        Complex output = this.subtract(input);
        return  output.distance();
    }

    /**
     * Divides two complex numbers, using input as the divisor.
     * @param input the Complex number to be used as the divisor
     * @return a resulting quotient, represented as a complex number.
     */
    public Complex divide(Complex input){
        double[] foil = new double[4];
        double[] divisor = new double[4];
        Complex numerator = this.multiply(input.conjugate());
        Complex denominator = input.multiply(input.conjugate());

        return new Complex(numerator.real / denominator.real, numerator.imaginary / denominator.real);
    }

    /**
     * Multiplies two complex numbers together
     * @param input The complex number to multiply by
     * @return The resulting product of the two complex numbers
     */
    public Complex multiply(Complex input){
        double[] foil = new double[4];

        foil[0] = real*input.real;
        foil[1] = real*input.imaginary;
        foil[2] = imaginary*input.real;
        foil[3] = imaginary*input.imaginary;
        foil[3] = -foil[3];

        return new Complex(foil[0] + foil[3], foil[1] + foil[2]);
    }

    /**
     * Subtracts two complex numbers, by subtracting input from another complex number
     * @param input The complex number to subtract
     * @return The resulting difference of the two complex numbers, represented as a complex number.
     */
    public Complex subtract(Complex input){
        return new Complex(real - input.real, imaginary - input.imaginary);
    }

    /**
     * Returns the conjugate of the Complex number.
     * @return The conjugate of the Complex number, represented as a Complex number.
     */
    public Complex conjugate(){
        return new Complex(real,-imaginary);
    }

    /**
     * Converts the Complex number to polar coordinates expressed as an angle in radians, and a magnitude.
     * @return An instance of class Polar, representing the values of the complex number.
     */
    public Polar toPolar(){
        return new Polar(Math.atan(imaginary/real), Math.sqrt((real*real) + (imaginary*imaginary)));
    }
    public double getReal(){return real;}
    public double getImaginary(){return real;}
    public String toString(){
        String output = "";
        if(real ==0 && imaginary ==0){
            output = "0";
        }
        else if(imaginary == 0){
            output=""+real;
        }
        else if(real == 0){
            output = imaginary + "j";
        }
        else if(imaginary > 0){
            output = real + " + " + imaginary + "j";
        }
        else{
            output = real + " - " + (-imaginary) + "j";
        }
        return output;
    }
}
