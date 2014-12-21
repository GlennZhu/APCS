package APCS.APCS.week1;

/**
 * Created by ziliangzhu on 12/21/14.
 */
public class CombinationWays {
    /**
     * In a matric, move from the top left(0,0)
     * You can move down or move to the right one
     * step at a time
     * To reach (i, j), how many combinations do you have?
     * @param i
     * @param j
     * @return
     */
    public int ways(int i, int j){
        // Base case
        if (i == 0 || j == 0) return 1; // && means and
        return ways(i - 1, j) + ways(i, j - 1);
    }
}
