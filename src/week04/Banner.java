package week04;

/**
 * Purpose: This class functions as a simple class to store multiple string variables that can be called by the driver
 * class by using the various get methods.
 *
 * @author:wesolowskitj
 * @version: 1.1
 * <p/>
 * Created on 1/8/2015 at 3:02 PM.
 */
public class Banner {

    private String title;
    private String description;
    private String author;

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//constructor
    Banner(String title, String description, String author){
        this.title = title;
        this.description = description;
        this.author = author;
    }
}
