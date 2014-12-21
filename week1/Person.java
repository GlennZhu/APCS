package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public abstract class Person {
    private boolean gender;
    private String name;
    private double weight, height;
    // Others...

    // Exercise: build a concrete professor
    // need methods for professor: get/set subject
    // You can add more Person's methods
    // get/set name

    public Person(boolean inputGender, String inputName,
                  double inputW, double height){
        gender = inputGender;
        name = inputName;
        weight = inputW;
        this.height = height;

//        height = height;

    }

    public double getHeight(){
        return height;
    }

    public void setHeight2(double inputHeight){
        height = inputHeight;
    }

    public void setHeight(double newHeight){
        height = newHeight;
        // height <-- newHeight;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public void test() {
        System.out.println("testtest");
    }

    public boolean getGender(){
        return gender;
    }

    public void setGender(boolean newGender){
        gender = newGender;
    }
}
