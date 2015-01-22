package week03;

/**
 * Purpose: To print the sum of numbers 1 to 5 as well as the product of these numbers.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created on 1/9/2015 at 6:49 PM.
 */
public class Problem3 {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int product = 1;
        do {
            count++;
            sum += count;
            product *= count;
            if (count == 5){
                System.out.println("Sum = " + sum);
                System.out.println("Product = " + product);
            }
        }while (count < 5);

    }
}
