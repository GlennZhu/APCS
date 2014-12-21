package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class Producer {
    private String name;
    private String location;
    private double price;

    public Producer(String inputName, String inputLocation, double inputPrice){
        name = inputName;
        location = inputLocation;
        price = inputPrice;
    }

    public String getName(){
        return name;
    }

    // Other methods...
}
