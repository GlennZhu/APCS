package APCS.APCS.week2.Saturday.recursion;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public class Fib {
    public int fib(int n) {
        // Base case
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
