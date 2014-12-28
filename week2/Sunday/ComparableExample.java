package APCS.APCS.week2.Sunday;

/**
 * Created by ziliangzhu on 12/28/14.
 */
public class ComparableExample implements Comparable<ComparableExample>{
    private int value;

    public ComparableExample(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(ComparableExample comparableExample) {
        if (value < comparableExample.value) return 1;
        else if (value == comparableExample.value) return 0;
        else return -1;
    }

    @Override
    public String toString(){
        return value + "";
    }
}
