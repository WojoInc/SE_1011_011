package week06;

/**
 * Labs 1011-011
 * Purpose:
 *
 * @author wesolowskitj
 * @version 1.0 Created on 2/11/2015 at 10:52 PM
 */
public class Zoo {
    private String[] animals;
    private String name;
    public void display(){
        if(animals[0].isEmpty()){
            System.out.println("The zoo is vacant.");
        }
        else{
            System.out.print(name + " zoo: ");
            for (int i=0; i<animals.length -1; i++){
                System.out.print(animals[i] + ", ");
            }
            System.out.print(animals[animals.length-1]);
        }
    }
    public Zoo(){
        this.animals = new String[] {""};
        this.name = "";
    }
    public Zoo(String[] animals, String name){
        this.animals = animals;
        this.name = name;
    }
}
