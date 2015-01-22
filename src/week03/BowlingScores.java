package week03;

/**
 * Purpose: To calculate the average score based on the total score summed from the various user inputs divided by the
 * number of user inputs.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created on 1/9/2015 at 7:13 PM.
 */
import java.util.Scanner;

public class BowlingScores {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int score;
        int totalScore = 0;
        int count = 0;
        double average = 0;
        boolean more = true;

        while (more == true){
            System.out.print("Enter score (-1 to quit): ");
            score = stdIn.nextInt();
            if(score <= 0){
                more = false;
            }
            else {
                totalScore += score;
                count++;
                average = (double) totalScore / count;
            }

        }

        System.out.println("Average score is " + average);
    }
}
