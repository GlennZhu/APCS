package APCS.week1;

/**
 * Created by ziliangzhu on 12/19/14.
 */
public class Ball {
    public static String commonMessage = "welcome";
    private final int id = 567856;
    private final int[] ids = {1};
    private String color = "green";
    private int x = 3, y = 5;
    private double radius = 0;
    private int secretNumber = 10;

    public Ball(String color, int x, int y, double radius){
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Ball(){
        ids[0] = 3;
        ids[1] = 5;
    }

    public void changeColor(String newColor){
        color = newColor;
    }

    public String getColor(){
        return color;
    }

    public void setX(int newX){
        x = newX;
        x = secretCalculate();
    }

    private int secretCalculate(){
        return x + y;
    }

    public static double add(int x, int y) {
        return x + y;
    }
}
