package APCS.APCS.week2.Saturday.InterfaceAbstractConcrete;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public abstract class AAnimal implements IAnimal{
    private String color;
    private int height;

    public AAnimal(String color, int height) {
        this.color = color;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void climb(int height) {
        this.height += height;
    }
}
