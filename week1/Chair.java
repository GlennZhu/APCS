package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class Chair {
    private String name = "MyChar";
    private int id;
    private double width, height, length;
    private Producer producer = new Producer("HaFactory", "Shanghai", 169);

    public Chair(String inputName, int inputID, double inputW,
                 double inputH, double inputL, Producer inputProducer){
        name = inputName;
        id = inputID;
        width = inputW;
        height = inputH;
        length = inputL;
        producer = inputProducer;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getId(){
        return id;

    }

    public void setId(int newId){
        id = newId; // Camel case
    }

    // getter and setter for width, height, and length
    // Exercise

    private double helpCombine(){
        return length + height + width;
    }

    /**
     *
     * @return length + height + width
     */
    public double getCombination(){
        return helpCombine();
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}
