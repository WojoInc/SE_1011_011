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
    public Complex divide(Complex input){
        double[] foil = new double[4];
        double[] divisor = new double[4];
        Complex numerator = this.multiply(conjugate(input));
        Complex denominator = input.multiply(conjugate(input));

        return new Complex(numerator.real / denominator.real, numerator.imaginary / denominator.real);
    }
    public Complex multiply(Complex input){
        double[] foil = new double[4];

        foil[0] = real*input.real;
        foil[1] = real*input.imaginary;
        foil[2] = imaginary*input.real;
        foil[3] = imaginary*input.imaginary;
        foil[3] = -foil[3];

        return new Complex(foil[0] + foil[3], foil[1] + foil[2]);
    }
    public Complex subtract(Complex input){
        return new Complex(real - input.real, imaginary - input.imaginary);
    }
    public Complex conjugate(Complex input){
        return new Complex(input.real,-input.imaginary);
    }
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
