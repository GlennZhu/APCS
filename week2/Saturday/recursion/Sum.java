package APCS.APCS.week2.Saturday.recursion;

/**
 * Created by ziliangzhu on 12/27/14.
 */

/**
 * 1 + 2 + 3 + ... + n
 */
public class Sum {
    public int sum(int n) {
        // Base case
        if (n == 1) return 1;
        // Inductive
//        int oneToNMinusOneResult = sum(n - 1); // 1 + 2 + ... + (n - 1);
//        return oneToNMinusOneResult + n;
        return sum(n - 1) + n;
    }
}
