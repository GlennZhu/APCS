package APCS.APCS.week2.Friday.recursion;

/**
 * Created by ziliangzhu on 12/26/14.
 */
public class SumRecursive {
    public int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
}
