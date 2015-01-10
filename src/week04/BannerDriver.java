package week04;

/**
 * Purpose:
 *
 * @author:Owner
 * @version: 1.1
 * <p/>
 * Created by Owner on 1/8/2015 at 3:02 PM.
 */
public class BannerDriver {
    public static void main(String[] args) {
        String author = "wesolowskitj";
        String title = "Banner Driver";
        String description = "This program should test the implementation of the Banner class";
        Banner testBanner = new Banner(title,description,author);
        System.out.println(testBanner.getTitle());
        System.out.println(testBanner.getDescription());
        System.out.println(testBanner.getAuthor());
        System.out.println(testBanner.getTitle());
        System.out.println(testBanner.getDescription());
        System.out.println(testBanner.getAuthor());

    }
}
