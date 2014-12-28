package APCS.APCS.week2.Saturday.recursion;

/**
 * Created by ziliangzhu on 12/27/14.
 */
public class Stairs {
    public int jumpWays(int n) {
        // Base case
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        // Inductive
        return jumpWays(n - 1) + jumpWays(n - 2) + jumpWays(n - 3);
    }
}
