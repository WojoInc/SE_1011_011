package week04;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/10/2015 at 10:54 PM
 */
public class StudentId {
    private String name;
    private int id;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getEmailAccount(){
        return "" + this.name.charAt(0) + this.id + "@pirate.park.edu";
    }
    public boolean isValid(){
        return this.id >= 100000 && this.id <= 999999;
    }
}
