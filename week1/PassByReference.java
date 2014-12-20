package APCS.week1;

/**
 * Created by ziliangzhu on 12/19/14.
 */
public class PassByReference {
    public static void increaseBoxValue(Box box) {
        box.increaseValue();
    }

    public static void decreaseBoxValue(Box box) {
        box.decreaseValue();
    }
}
