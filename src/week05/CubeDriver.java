package week05;
import week04.Banner;
/**
 * Purpose:
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created by wesolowskitj on 1/14/2015 at 3:21 PM.
 */
public class CubeDriver {
    public static void main(String[] args) {
        Banner welcomeBanner = new Banner("Cube Game","Testing Cube class","wesolowskitj");
        Cube testCube = new Cube("player 1",20);
        int x = 0;
        while(x<501){
            testCube.roll();
            System.out.println(testCube.getFaceUp());
            x++;
        }

    }
}
