package APCS.week1;

/**
 * Created by ziliangzhu on 12/20/14.
 */
public class Computer {
    // Field. Understand as feature
    private String color = "yellow";
    private int size = 10;

    // Methods. Understand as function
    public Computer(String inputColor, int inputSize){
        color = inputColor;
        size = inputSize;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int newSize){// void means no return value
        size = newSize;
    }
}
