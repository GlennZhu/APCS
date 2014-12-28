package APCS.APCS.week2.Sunday;

/**
 * Created by ziliangzhu on 12/28/14.
 */
public class Multiply {
    public int multiply(int n, int first, int second) {
        // Base
        if (n == 1) return first;
        if (n == 2) return second;
        // Inductive
        return multiply(n - 1, first, second) * multiply(n - 2, first, second);
    }
}
