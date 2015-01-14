package week04;

/**
 * Purpose: This class serves as a driver class to test the function of the Banner class.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * Created on 1/8/2015 at 3:02 PM.
 */
public class BannerDriver {

    public static void main(String[] args) {
        String author = "wesolowskitj";
        String title = "Banner Driver";
        String description = "This program should test the implementation of the Banner class";
        //create instance of Banner class with default constructor and print values from get methods to console
        Banner testBanner = new Banner(title,description,author);
        System.out.println(testBanner.getTitle());
        System.out.println(testBanner.getDescription());
        System.out.println(testBanner.getAuthor());

    }
}
