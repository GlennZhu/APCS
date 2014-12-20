package APCS.week1;

/**
 * Created by ziliangzhu on 12/20/14.
 */
public class IntegerWrapper {
    private int value; // 10
    private int password = 123;
    public static String brand = "mac";

    public IntegerWrapper(int inputValue) {
        value = inputValue;
    }

    public int getValue(){
        String result = print();
        return value;
    }

    private String print() {
        System.out.println(add(1, 2));
        return "hahahahaha";
    }

    private int add(int i, int j){
        return i + j;
    }

    public static void printMe() {
        System.out.println("haha");
    }
}
